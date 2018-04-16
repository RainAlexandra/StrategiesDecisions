package strategiesdecisions.selectstrategies;

import java.util.List;
import java.util.LinkedList;

import strategiesdecisions.beans.*;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc1</b> - Agent "X" selects a response that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateSelect implements ISelectStrategy {
	
	private List<Message> responses;
	
	public ImmediateSelect(LinkedList<Message> responses){
		this.responses = responses;
	}

	public List<Message> getResponses() {
		return responses;
	}

	public void setResponses(LinkedList<Message> responses){
		this.responses = responses;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Select");
//		List<Message> replies = comm.recevoirMessages(0); // destinataire = 0
//		bestReplier = best(replies) -> 1

		Message binding = new Binding("X", "refBinder", "serviceRef_X", "this is a binding request", 0);
		comm.envoyerMessage(binding);
		
		Message selection = new Selection("X", "Y", "Binder", "this is a selection message", 0);
		
//		comm.envoyerMessage(0, 1, selection);
		comm.envoyerMessage(selection);

		// S <- SN, SWA
	}
}
