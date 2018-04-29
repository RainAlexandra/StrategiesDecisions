package strategiesdecisions.Advertise;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Utility;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.4</b> - The agent sends an "Ad" message to all the agents present in 
 * the system. This action cannot be repeated until a particular event occurs 
 * or the defined interval of time has elapsed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEvtRepAdInBroadcast implements IAdvertiseStrategy {

	private ReferenceAgent agent;
	private int dt;
	
	public TimeEvtRepAdInBroadcast(ReferenceAgent agent, int dt){
		this.agent = agent;
		this.dt = dt;
	}
	
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("time-Event-Repeated-Ad-In-Broadcast");
		
		MessageAgent ad = new AdMessage(service, agent, null); // the recipient list is null since this is a broadcast ad
		comm.diffuserMessage(ad);
		
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
