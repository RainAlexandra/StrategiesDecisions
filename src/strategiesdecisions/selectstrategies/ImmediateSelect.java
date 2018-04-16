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
	
	private String agent;
	private List<Message> responses;
	
	public ImmediateSelect(String agent, LinkedList<Message> responses){
		this.agent = agent;
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
//		List<Message> replies = comm.recevoirMessages(0); // destinataire = X
//		String bestReplier = best(replies) -> Y
		String bestReplier = "Y"; // to remove
		
		// the binder will be created and initialized with the service of the advertising agent
		Message binding = new Binding(agent, "Binder agent", "serviceRef_" + agent, "this is a binding request", 0);
		comm.envoyerMessage(binding);
		
		Message selection = new Selection(agent, bestReplier, "Binder agent", "this is a selection message", 0);
		
//		comm.envoyerMessage(0, 1, selection);
		comm.envoyerMessage(selection);

		// S <- SN, SWA
	}
}
