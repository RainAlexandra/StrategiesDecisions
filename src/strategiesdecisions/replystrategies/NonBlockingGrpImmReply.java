package strategiesdecisions.replystrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR1.2</b> - Agent "Y" sends a reply to the advertisement of interest 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingGrpImmReply implements IReplyStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Immediate-Grouped-Response");
	}
}
