package strategiesdecisions.Advertise;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.1</b> - The agent sends an "Ad" message to a group (can be an 
 * individual) of agents in the system
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInMulticast implements IAdvertiseStrategy {
	
	private String agent;
	private List<String> targetAgents = new ArrayList<>();

	// when initializing the SA2.1 strategy the list of agents is required for the multicast
	public SingleAdInMulticast(String agent, String... targetAgents){
		this.agent = agent;
		for (String a : targetAgents){
			this.targetAgents.add(a);
		}
	}

	public void setTargetAgents(List<String> agents) {
		this.targetAgents = agents;
	}
	
	public List<String> getTargetAgents() {
		return targetAgents;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Multicast");
		MessageAgent ad;
		
		// envoie aux agents
		for (String a : targetAgents){
			// String recipient = a.getID()
			ad = new AdMessage(agent, a, "this is a multicast ad", 0);
			comm.envoyerMessage(ad);
		}
		// S <- S - SAD
	}
}