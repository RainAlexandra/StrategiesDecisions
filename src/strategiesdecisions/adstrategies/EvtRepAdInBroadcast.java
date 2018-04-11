package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.3</b> - The agent sends an ad to all the agents of the system. 
 * This action is can only be repeated once a particular event "e" occurs
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer(ICommunication comm){
		System.out.println("event-Repeated-Ad-In-Broadcast");
	}
}
