package strategiesdecisions.Advertise;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.2</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action can only be repeated after each "Dt" interval
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInMulticast implements IAdvertiseStrategy {
	
	private String agent;
	private List<String> targetAgents = new ArrayList<>();
	private int dt;
	
	// when initializing the SA2.2 strategy the list of agents is required for the multicast
	public TimeRepAdInMulticast(String agent, int dt, String... targetAgents){
		this.agent = agent;
		this.dt = dt;
		for (String a : targetAgents){
			this.targetAgents.add(a);
		}
	}
	
	public void setTargetAgents(List<String> agents) {
		this.targetAgents = agents;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Repeated-Ad-In-Multicast");
	
		MessageAgent ad; 
		
		// envoie aux agents
		for (String a : targetAgents){
			// String recipient = a.getID();
			ad = new AdMessage(agent, a, "this is a multicast ad", 0);
			comm.envoyerMessage(ad);
		}
		
		while (dt > 0){
			dt --;
			// S <- S - SAD
		}
		// S <- S
	}
}
