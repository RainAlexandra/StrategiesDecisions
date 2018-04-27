package strategiesdecisions.Advertise;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Utility;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.4</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action cannot be repeated until a particular event 
 * occurs or the defined interval of time "Dt" has elapsed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEvtRepAdInMulticast implements IAdvertiseStrategy {

	private String agent;
	private List<String> targetAgents = new ArrayList<>();
	private int dt;
	
	// when initializing the SA2.4 strategy the list of agents is required for the multicast
	public TimeEvtRepAdInMulticast(String agent, int dt, String... targetAgents){
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
		System.out.println("time-Event-Repeated-Ad-In-Multicast");
	
		MessageAgent ad; 
		
		// envoie aux agents
		for (String a : targetAgents){
			// String recipient = a.getID();
			ad = new AdMessage(agent, a, "this is a multicast ad", 0);
			comm.envoyerMessage(ad);
		}
		
		boolean event = false;
		do {
			// List<Message> msgs = agent.getReceivedMsgs();
			List<MessageAgent> msgs = null; // to remove
			event = Utility.findEvent(msgs);
			dt--;
			
			// S <- S - SAD
		} while (!event && dt > 0);
		// S <- S
	}
}
