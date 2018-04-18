package strategiesdecisions.adstrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Utility;
import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.3</b> - The agent sends an ad to a group (can be an individual) of 
 * agents in the system. This action can only be repeated once a particular 
 * event "e" occurs
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInMulticast implements IAdvertiseStrategy {

	private String agent;
	private List<String> targetAgents = new ArrayList<>();
	
	// when initializing the SA2.3 strategy the list of agents is required for the multicast
	public EvtRepAdInMulticast(String agent, String... targetAgents){
		this.agent = agent;
		for (String a : targetAgents){
			this.targetAgents.add(a);
		}
	}
	
	public void setAgents(List<String> agents) {
		this.targetAgents = agents;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("event-Repeated-Ad-In-Multicast");
		
		Message ad;
		
		// envoie aux agents
		for (String a : targetAgents){
			// String recipient = a.getID();
			ad = new Ad(agent, a, "this is a multicast ad", 0);
			comm.envoyerMessage(ad);
		}
		
		boolean event = false;
		do {
			// List<Message> msgs = agent.getReceivedMsgs();
			List<Message> msgs = null; // to remove
			event = Utility.findEvent(msgs);
			
			// S <- S - SAD
		} while (!event);
		//S <- S
	}
}
