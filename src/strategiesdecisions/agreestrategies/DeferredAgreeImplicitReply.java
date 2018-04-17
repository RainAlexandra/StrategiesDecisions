package strategiesdecisions.agreestrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.replystrategies.NoReply;

/**
 * <b>SAG2.1</b> - Agent "Y" does not immediately accept agent "X"'s binding 
 * request but waits for a length of time "dt" to elapse. The binder agent 
 * is then contacted in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeImplicitReply extends AAgreeStrategy {
	
	private int dt;

	public DeferredAgreeImplicitReply(String agent, LinkedList<Message> selections, int dt) {
		super(agent, selections);
		this.dt = dt;
	}
		
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Agreement-Implicit-Response");
		
		while (dt > 0){
			(new NoReply(agent)).executer(comm); // on ne fait rien
			dt--;
		}
		
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
		String refBinder = "Binder agent"; // to remove
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
