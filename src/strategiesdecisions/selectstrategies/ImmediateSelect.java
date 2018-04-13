package strategiesdecisions.selectstrategies;

import java.util.Set;
import java.util.HashSet;

import strategiesdecisions.beans.*;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc1</b> - Agent "X" selects a response that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateSelect implements ISelectStrategy {
	
	private Set<Message> responses;
	
	public ImmediateSelect(HashSet<Message> responses){
		this.responses = responses;
	}

	public Set<Message> getResponses() {
		return responses;
	}

	public void setResponses(HashSet<Message> responses){
		this.responses = responses;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Select");
//		List<Message> replies = comm.recevoirMessages(0); // destinataire = 0
//		bestReplier = best(replies) -> 1

		Message binding = new Binding("0", "Binder", "serviceRef0", "this is a binding request", 0);
		comm.envoyerMessage(binding);
		
		Message selection = new Selection("0", "1", "Binder", "this is a selection message", 0);
		
//		comm.envoyerMessage(0, 1, selection);
		comm.envoyerMessage(selection);

		// S <- SN, SWA
	}
}
