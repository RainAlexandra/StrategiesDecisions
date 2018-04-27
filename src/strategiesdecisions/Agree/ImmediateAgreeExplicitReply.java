package strategiesdecisions.Agree;

import java.util.List;
import java.util.ArrayList;

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
	
	private String agent;
	private List<MessageAgent> selections;
	
	public ImmediateAgreeExplicitReply(String agent, ArrayList<MessageAgent> selections){
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
	private ArrayList<String> getRejectedSelectionTransmitters(String selectedTransmitter){
		ArrayList<String> rejectedTransmitters = new ArrayList<>();
		for (MessageAgent m : selections){
			String transmitter = m.getTransmitter();
			if (transmitter.compareTo(selectedTransmitter) != 0)
				rejectedTransmitters.add(transmitter);
		}
		return rejectedTransmitters;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Explicit-Response");
		
//		Message bestSelection = best(selections)
		MessageAgent bestSelection = selections.get(0); // to remove
		String refBinder = ((SelectionMessage) bestSelection).getBinder();
		String selectionTransmitter = bestSelection.getTransmitter();
		ArrayList<String> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		MessageAgent binding = new BindingMessage(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		MessageAgent agreement = new AgreementMessage(agent, selectionTransmitter, "Agree", 0);

//		No agree message sent to all rejects
		MessageAgent noAgreement;		
		for (String reject : rejects){
			noAgreement = new AgreementMessage(agent, reject, "No Agree", 0);
			comm.envoyerMessage(noAgreement);
		}
		
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
		
		// S <- SN, SWA
	}
}
