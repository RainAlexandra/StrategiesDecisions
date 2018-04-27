package strategiesdecisions.agreestrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.Agreement;
import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Selection;

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
	private List<Message> selections;
	private int dt;
	
	public DeferredAgreeExplicitReply(String agent, ArrayList<Message> selections, int dt) {
		this.agent = agent;
		this.selections = selections;
		this.dt = dt;
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
		System.out.println("deferred-Agreement-Explicit-Response");
	
		System.out.println("Wait for " + dt + " cycles");
		while (dt > 0){
			// selections <- selections U {m} pour tout m selection
			// S <- S - SAG
			dt--;
		}
		System.out.println("Wait over.");

//		setSelections(agent.getSelections);
//		Message bestSelection = best(selections)
		Message bestSelection = selections.get(0); // to remove
		String refBinder = ((Selection)bestSelection).getBinder();
		String selectionTransmitter = bestSelection.getTransmitter();
		ArrayList<String> rejects = getRejectedSelectionTransmitters(selectionTransmitter);
		
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		Message agreement = new Agreement(agent, selectionTransmitter, "Agree", 0);

//		No agree message sent to all rejects
		Message noAgreement;		
		for (String reject : rejects){
			noAgreement = new Agreement(agent, reject, "No Agree", 0);
			comm.envoyerMessage(noAgreement);
		}
		comm.envoyerMessage(binding);
		comm.envoyerMessage(agreement);
		
		// S <- SN, SWA
	}
	
}
