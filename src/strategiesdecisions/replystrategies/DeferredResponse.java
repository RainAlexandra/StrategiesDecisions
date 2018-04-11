package strategiesdecisions.replystrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR3</b> - Agent "Y" does not immediately send a Reply but differs its 
 * reply for a length of time "Dt" and answers ones the ad of highest interest 
 * is received
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredResponse implements IReplyStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Response");
	}
}
