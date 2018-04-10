package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SSlc1</b> - Agent "X" selects an answer that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 */
public class ImmediateSelect implements ISelectStrategy {
	
	@Override
	public void executer(){
		System.out.println("immediate-Select");
	}
}
