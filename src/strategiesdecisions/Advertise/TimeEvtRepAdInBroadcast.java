package strategiesdecisions.Advertise;

import java.util.List;

import strategiesdecisions.Utility;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.4</b> - The agent sends an "Ad" message to all the agents present in 
 * the system. This action cannot be repeated until a particular event occurs 
 * or the defined interval of time has elapsed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEvtRepAdInBroadcast implements IAdvertiseStrategy {

	private String agent;
	private int dt;
	
	public TimeEvtRepAdInBroadcast(String agent, int dt){
		this.agent = agent;
		this.dt = dt;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Event-Repeated-Ad-In-Broadcast");
		
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
