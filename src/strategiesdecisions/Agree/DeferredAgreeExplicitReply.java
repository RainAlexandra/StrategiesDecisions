package strategiesdecisions.Agree;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Message.AgreementMessage;
import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.SelectionMessage;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG2.2</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "Dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done and sends an 
 * "Agree" message to "X" and "Not Agree" messages to the others
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeExplicitReply implements IAgreeStrategy {
	
	private ReferenceAgent agent;
	private ArrayList<MessageAgent> selections;
	private int dt;
	
	public DeferredAgreeExplicitReply(ReferenceAgent agent, ArrayList<MessageAgent> selections, int dt) {
		this.agent = agent;
		this.selections = selections;
		this.dt = dt;
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
		System.out.println("deferred-Agreement-Explicit-Response");
	
		while (dt > 0){
			// selections <- selections U {m} pour tout m selection
			// S <- SAG
			dt--;
		}

//		MessageAgent bestSelection = best(selections)
		MessageAgent bestSelection = selections.get(0); // to remove
		ReferenceAgent refBinder = ((SelectionMessage)bestSelection).getAgentBinder();
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
