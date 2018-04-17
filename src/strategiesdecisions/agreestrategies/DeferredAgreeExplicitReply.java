package strategiesdecisions.agreestrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG2.2</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "Dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done and sends an 
 * "Agree" message to "X" and "Not Agree" messages to the others
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeExplicitReply extends AAgreeStrategy {
	
	public DeferredAgreeExplicitReply(String agent, LinkedList<Message> selections) {
		super(agent, selections);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Explicit-Response");
	}
}
