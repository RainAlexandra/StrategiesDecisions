package strategiesdecisions.adstrategies;

import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.1</b> - The agent sends an "Ad" message to all the agents present in 
 * the system
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer(ICommunication comm){
//		System.out.println("single-Ad-In-Broadcast");
		Message ad = new Ad();
		comm.diffuserMessage(ad);
//		S <- S - SAD
	}
}
