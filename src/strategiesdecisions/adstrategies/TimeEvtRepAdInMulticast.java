package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.4</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action cannot be repeated until a particular event 
 * occurs or the defined interval of time "Dt" has elapsed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEvtRepAdInMulticast implements IAdvertiseStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Event-Repeated-Ad-In-Multicast");
	}
}
