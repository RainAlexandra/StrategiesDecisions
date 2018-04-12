package strategiesdecisions.selectstrategies;

import java.util.List;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SSlc1</b> - Agent "X" selects an answer that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateSelect implements ISelectStrategy {
		
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Select");
		List<Message> replies = comm.recevoirMessages(0); // destinataire = 0
		// bestReplier = best(replies) -> 1
		Message selection = new Selection("0", "1", "this is a selection message", 0);
//		comm.envoyerMessage(0, 1, selection);
		comm.envoyerMessage(selection);
		// S <- SN, SWA
	}
}
