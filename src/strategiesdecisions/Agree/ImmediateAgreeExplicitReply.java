package strategiesdecisions.Agree;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Message.*;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG1.2</b> - Agent "Y" accepts the binding request made by agent "X".
 * "Y" contacts the binder agent in order for the the physical binding to be done
 * and sends an "Agree" message to "X" and "Not agree" messages to the others
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeExplicitReply implements IAgreeStrategy {
	
	private ReferenceAgent agent;
	private ArrayList<MessageAgent> selections;
	
	public ImmediateAgreeExplicitReply(ReferenceAgent agent, ArrayList<MessageAgent> selections){
		this.agent = agent;
		this.selections = selections;
	}
		
	public void setSelections(ArrayList<MessageAgent> selections) {
		this.selections = selections;
	}
	
	/**
	 * @param selectedTransmitter the transmitter whose message was selected
	 * @return the list of rejected selection transmitters
	 */
	private ArrayList<ReferenceAgent> getRejectedSelectionTransmitters(ReferenceAgent selectedTransmitter){
		ArrayList<ReferenceAgent> rejectedTransmitters = new ArrayList<>();
		for (MessageAgent m : selections){
			ReferenceAgent transmitter = m.getExpediteur();
			if (! transmitter.equals(selectedTransmitter))
				rejectedTransmitters.add(transmitter);
		}
		return rejectedTransmitters;
	}
	
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("immediate-Agreement-Explicit-Response");
		
//		MessageAgent bestSelection = best(selections)
		MessageAgent bestSelection = selections.get(0); // to remove
		ReferenceAgent refBinder = ((SelectionMessage) bestSelection).getAgentBinder();
		ReferenceAgent selectionTransmitter = bestSelection.getExpediteur();
		ArrayList<ReferenceAgent> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		MessageAgent binding = new BindingMessage("", "", "", "", 0);
		
		ArrayList<ReferenceAgent> recipient = new ArrayList<>();
		recipient.add(selectionTransmitter);
		MessageAgent agreement = new AgreementMessage(service, agent, recipient);

//		No agree message sent to all rejects
		MessageAgent noAgreement = new AgreementMessage(service, agent, rejects);		
		comm.envoyerMessage(noAgreement);
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
		
		// S <- SN, SWA
	}
}
