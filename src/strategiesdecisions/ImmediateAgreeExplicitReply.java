package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SAG1.2</b> - Agent "Y" accepts the binding request made by agent "X".
 * "Y" contacts the binder agent in order for the the physical binding to be done
 * and sends an "Agree" message to "X" and "Not agree" messages to the others
 */
public class ImmediateAgreeExplicitReply implements IAgreeStrategy {
	
	@Override
	public void executer(){
		System.out.println("immediate-Agreement-Explicit-Response");
	}
}
