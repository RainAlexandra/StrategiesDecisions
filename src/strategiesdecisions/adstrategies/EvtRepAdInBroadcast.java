package strategiesdecisions.adstrategies;

import java.util.List;

import strategiesdecisions.Utility;
import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.3</b> - The agent sends an ad to all the agents of the system. 
 * This action is can only be repeated once a particular event "e" occurs
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInBroadcast implements IAdvertiseStrategy {

	private String agent;
	
	public EvtRepAdInBroadcast(String agent) {
		this.agent = agent;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("event-Repeated-Ad-In-Broadcast");
		
		Message ad =  new Ad(agent, "", "this is an advertisement", 0);
		comm.diffuserMessage(ad);
		
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
