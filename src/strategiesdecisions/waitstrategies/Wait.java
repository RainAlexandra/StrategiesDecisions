package strategiesdecisions.waitstrategies;

import java.util.HashMap;
import java.util.TreeSet;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SW1.1</b> - The agent saves all received messages 
 * (ad, reply, select, etc...) 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Wait implements IWaitStrategy {
	
	HashMap<String, TreeSet<Message>> hm = new HashMap<>();  
	
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("wait");
	}
}
