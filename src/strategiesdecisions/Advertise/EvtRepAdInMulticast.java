package strategiesdecisions.Advertise;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Utility;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.3</b> - The agent sends an ad to a group (can be an individual) of 
 * agents in the system. This action can only be repeated once a particular 
 * event "e" occurs
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInMulticast implements IAdvertiseStrategy {

	private ReferenceAgent agent;
	private ArrayList<ReferenceAgent> targetAgents = new ArrayList<>();
	
	// when initializing the SA2.3 strategy the list of agents is required for the multicast
	public EvtRepAdInMulticast(ReferenceAgent agent, ReferenceAgent... targetAgents){
		this.agent = agent;
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
		System.out.println("event-Repeated-Ad-In-Multicast");
		
		MessageAgent ad = new AdMessage(service, agent, targetAgents);
		comm.diffuserMessage(ad);
		
		boolean event = false;
		do {
			// ArrayList<Message> msgs = agent.getReceivedMsgs();
			ArrayList<MessageAgent> msgs = null; // to remove
			event = Utility.findEvent(msgs);
			
			// S <- S - SAD
		} while (!event);
		//S <- S
	}
}
