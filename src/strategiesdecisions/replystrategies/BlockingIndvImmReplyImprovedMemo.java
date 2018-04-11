package strategiesdecisions.replystrategies;

/**
 * <b>SR2.3</b> - Agent "Y" sends a Reply to the Ad sent by agent "X", considered to be of interest, 
 * and then blocks itself while continuing to receive other ads and saving those that are considered 
 * to be of interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class BlockingIndvImmReplyImprovedMemo implements IReplyStrategy {

	@Override
	public void executer() {
		System.out.println("blocking-Targeted-Immediate-Response-Improved-Memorization");
	}
}
