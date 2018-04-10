package strategiesdecisions;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent 
 * the advertisement of most interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {
	
	@Override
	public void executer(){
		System.out.println("non-Blocking-Targeted-Immediate-Response");
	}
}
