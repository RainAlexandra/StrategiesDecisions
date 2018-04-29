package strategiesdecisions.Advertise;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Utility;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.4</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action cannot be repeated until a particular event 
 * occurs or the defined interval of time "Dt" has elapsed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEvtRepAdInMulticast implements IAdvertiseStrategy {

	private ReferenceAgent agent;
	private ArrayList<ReferenceAgent> targetAgents = new ArrayList<>();
	private int dt;
	
	// when initializing the SA2.4 strategy the list of agents is required for the multicast
	public TimeEvtRepAdInMulticast(ReferenceAgent agent, int dt, ReferenceAgent... targetAgents){
		this.agent = agent;
		this.dt = dt;
		for (ReferenceAgent a : targetAgents){
			this.targetAgents.add(a);
		}
	}
	
	public void setTargetAgents(ArrayList<ReferenceAgent> agents) {
		this.targetAgents = agents;
	}
	
	public ArrayList<ReferenceAgent> getTargetAgents() {
		return targetAgents;
	}
	
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("time-Event-Repeated-Ad-In-Multicast");
	
		MessageAgent ad = new AdMessage(service, agent, targetAgents);
		comm.envoyerMessage(ad);
				
		boolean event = false;
		do {
			// ArrayList<Message> msgs = agent.getReceivedMsgs();
			ArrayList<MessageAgent> msgs = null; // to remove
			event = Utility.findEvent(msgs);
			dt--;
			
			// S <- S - SAD
		} while (!event && dt > 0);
		// S <- S
	}
}
