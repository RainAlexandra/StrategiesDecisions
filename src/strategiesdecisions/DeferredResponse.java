package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SR3</b> - Agent "Y" does not immediately send a Reply but differs its 
 * reply for a length of time "Dt" and answers ones the ad of highest interest 
 * is received
 */
public class DeferredResponse implements IReplyStrategy {
	
	@Override
	public void executer(){
		System.out.println("deferred-Response");
	}
}
