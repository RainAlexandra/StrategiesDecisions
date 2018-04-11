package strategiesdecisions.waitstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SW1.1</b> - The agent saves all received messages 
 * (ad, reply, select, etc...) 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Wait implements IWaitStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("wait");
	}
}
