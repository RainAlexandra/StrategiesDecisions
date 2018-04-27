package strategiesdecisions.Agree;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.Message.AgreementMessage;
import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.MessageAgent;
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
	
	private String agent;
	private List<MessageAgent> selections;
	private int dt;
	
	public DeferredAgreeExplicitReply(String agent, LinkedList<MessageAgent> selections, int dt) {
		this.agent = agent;
		this.selections = selections;
		this.dt = dt;
	}
	
	public void setSelections(List<MessageAgent> selections) {
		this.selections = selections;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Explicit-Response");
	
		while (dt > 0){
			// selections <- selections U {m} pour tout m selection
			// S <- SAG
			dt--;
		}

//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
//		String selectionTransmitter = bestSelection.getTransmitter();
//		ArrayList<String> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		String refBinder = "Binder agent"; // to remove
		String selectionTransmitter = "X"; // to remove
		
		MessageAgent binding = new BindingMessage(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		MessageAgent agreement = new AgreementMessage(agent, selectionTransmitter, "Agree", 0);

//		No agree message sent to all rejects
//		Message noAgreement;		
//		for (String reject : rejects){
//			noAgreement = new Agreement(agent, reject, "No Agree", 0);
//			comm.envoyerMessage(noAgreement);
//		}
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
		
		// S <- SN, SWA
	}
	
}
