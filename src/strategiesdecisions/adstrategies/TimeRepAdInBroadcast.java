package strategiesdecisions.adstrategies;

import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.2</b> - The agent sends an "Ad" message to all the agents present in
 * the system. This action can only be repeated after each "Dt" interval
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInBroadcast implements IAdvertiseStrategy {

	private String agent;
	private int Dt;
		
	public TimeRepAdInBroadcast(String agent, int dt) {
		this.agent = agent;
		this.Dt = dt;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Repeated-Ad-In-Broadcast");
		Message ad = new Ad(agent, "", "this is an adevertisement", 0);
		comm.diffuserMessage(ad);
		while (Dt > 0){
			// S <- S - SAD
		}
	}
}
