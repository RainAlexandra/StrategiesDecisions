package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SR1.2</b> - Agent "Y" sends a reply to the advertisement of interest 
 */
public class NonBlockingGrpImmReply implements IReplyStrategy {
	
	@Override
	public void executer(){
		System.out.println("non-Blocking-Immediate-Grouped-Response");
	}
}
