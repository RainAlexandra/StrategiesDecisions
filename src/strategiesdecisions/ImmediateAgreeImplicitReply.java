package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SAG1.1</b> - Agent "Y" accepts the binding request made by agent "X" and
 * contacts the binder agent in order for the physical binding to be done
 */
public class ImmediateAgreeImplicitReply implements IAgreeStrategy {
	
	@Override
	public void executer(){
		System.out.println("immediate-Agreement-Implicit-Response");
	}
}
