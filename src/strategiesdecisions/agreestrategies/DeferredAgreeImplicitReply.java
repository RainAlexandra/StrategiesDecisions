package strategiesdecisions.agreestrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG2.1</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "Dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeImplicitReply implements IAgreeStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");
	}
}