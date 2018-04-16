package strategiesdecisions.agreestrategies;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SAG1.2</b> - Agent "Y" accepts the binding request made by agent "X".
 * "Y" contacts the binder agent in order for the the physical binding to be done
 * and sends an "Agree" message to "X" and "Not agree" messages to the others
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeExplicitReply implements IAgreeStrategy {
	
	private List<Message> selections;
	
	public ImmediateAgreeExplicitReply(LinkedList<Message> selections){
		this.selections = selections;
	}
	
	public List<Message> getSelections(){
		return selections;
	}
	
	public void setSelections(List<Message> selections) {
		this.selections = selections;
	}
	
	/**
	 * @param selectedTransmitter the transmitter whose message was selected
	 * @return the list of rejected selection transmitters
	 */
	private ArrayList<String> getRejectedSelectionTransmitters(String selectedTransmitter){
		ArrayList<String> rejectedTransmitters = new ArrayList<>();
		for (Message m : selections){
			String transmitter = m.getTransmitter();
			if (transmitter.compareTo(selectedTransmitter) != 0)
				rejectedTransmitters.add(transmitter);
		}
		return rejectedTransmitters;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Explicit-Response");
//		Selection bestSelection = best(selections) -> 1
//		String refBinder = bestSelection.getBinder();
//		String selectionTransmitter = bestSelection.getTransmitter();
//		ArrayList<String> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		Message binding = new Binding("Y", "refBinder", "serviceRef_Y", "this is a binding agreement", 0);
		Message agreement = new Agreement("Y", "selectionTransmitter", "Agree", 0);
//		Message noAgreement;
//		
//		for (String agent : rejects){
//			noAgreement = new Agreement("Y", agent, "No Agree", 0);
//			comm.envoyerMessage(noAgreement);
//		}
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
	}
}
