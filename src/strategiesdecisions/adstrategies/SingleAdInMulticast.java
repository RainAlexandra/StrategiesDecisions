package strategiesdecisions.adstrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Ad;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.1</b> - The agent sends an "Ad" message to a group (can be an 
 * individual) of agents in the system
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInMulticast extends AAdStrategy {
	
	private List<String> targetAgents = new ArrayList<>();

	// when initializing the SA2.1 strategy the list of agents is required for the multicast
	public SingleAdInMulticast(String agent, String... targetAgents){
		super(agent);
		for (String a : targetAgents){
			this.targetAgents.add(a);
		}
	}

	public List<String> getTargetAgents() {
		return targetAgents;
	}

	public void setAgents(List<String> targetAgents) {
		this.targetAgents = targetAgents;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Multicast");
		Message ad;
		
		for (String a : targetAgents){
			// String recipient = a.getID()
			ad = new Ad(agent, a, "this is a multicast ad", 0);
			comm.envoyerMessage(ad);
			// S <- S - SAD
		}
	}
}
