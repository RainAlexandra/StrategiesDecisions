package strategiesdecisions.agreestrategies;

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
public class ImmediateAgreeExplicitReply extends AAgreeStrategy {
	
	public ImmediateAgreeExplicitReply(String agent, LinkedList<Message> selections) {
		super(agent, selections);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Explicit-Response");
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
//		String selectionTransmitter = bestSelection.getTransmitter();
//		ArrayList<String> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		String refBinder = "Binder agent"; // to remove
		String selectionTransmitter = "X"; // to remove
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		Message agreement = new Agreement(agent, selectionTransmitter, "Agree", 0);

//		No agree message sent to all rejects
//		Message noAgreement;		
//		for (String reject : rejects){
//			noAgreement = new Agreement(agent, reject, "No Agree", 0);
//			comm.envoyerMessage(noAgreement);
//		}
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
	}
}
