package strategiesdecisions.agreestrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG1.2</b> - Agent "Y" accepts the binding request made by agent "X".
 * "Y" contacts the binder agent in order for the the physical binding to be done
 * and sends an "Agree" message to "X" and "Not agree" messages to the others
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeExplicitReply implements IAgreeStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Explicit-Response");
	}
}