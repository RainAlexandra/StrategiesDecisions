package strategiesdecisions.adstrategies;

import strategiesdecisions.ICommunication;

/**
 * <b>SA2.1</b> - The agent sends an "Ad" message to a group (can be an 
 * individual) of agents in the system
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInMulticast implements IAdvertiseStrategy {

	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Multicast");
	}
}
