package strategiesdecisions.Advertise;

import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.2</b> - The agent sends an "Ad" message to all the agents present in
 * the system. This action can only be repeated after each "dt" interval
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInBroadcast implements IAdvertiseStrategy {

	private String agent;
	private int dt;
		
	public TimeRepAdInBroadcast(String agent, int dt) {
		this.agent = agent;
		this.dt = dt;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Repeated-Ad-In-Broadcast");
		
		MessageAgent ad = new AdMessage(agent, "this is an adevertisement", 0);
		comm.diffuserMessage(ad);
		while (dt > 0){
			dt--;
			// S <- S - SAD
		}
		// S <- S
	}
}