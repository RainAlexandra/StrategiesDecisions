package strategiesdecisions;

/**
 * <b>SR2.1</b> - Agent "Y" sends a Reply to the Ad sent by agent "X" 
 * considered to be of interest, and then blocks itself while ignoring all 
 * other ads
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public final class BlockingIndvImmReplyNoMemo implements IReplyStrategy {

	@Override
	public void executer(){
		System.out.println("blocking-Targeted-Immediate-Response-NMemorization");
	}
}
