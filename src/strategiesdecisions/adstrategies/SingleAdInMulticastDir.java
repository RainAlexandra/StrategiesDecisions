package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.5</b> - The agent sends an "Ad" message to a group of agents present 
 * in the directory
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInMulticastDir implements IAdvertiseStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Multicast-Directory");
	}
}
