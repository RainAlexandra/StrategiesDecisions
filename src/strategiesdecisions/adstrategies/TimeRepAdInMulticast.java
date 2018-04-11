package strategiesdecisions.adstrategies;

import strategiesdecisions.ICommunication;

/**
 * <b>SA2.2</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action can only be repeated after each "Dt" interval
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInMulticast implements IAdvertiseStrategy {

	@Override
	public void executer(ICommunication comm){
		System.out.println("time-Repeated-Ad-In-Multicast");
	}
}
