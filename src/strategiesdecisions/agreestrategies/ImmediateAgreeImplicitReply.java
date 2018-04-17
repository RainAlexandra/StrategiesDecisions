package strategiesdecisions.agreestrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG1.1</b> - Agent "Y" accepts the binding request made by agent "X" and
 * contacts the binder agent in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeImplicitReply extends AAgreeStrategy {
	
	public ImmediateAgreeImplicitReply(String agent, LinkedList<Message> selections) {
		super(agent, selections);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Implicit-Response");
//		Selection bestSelection = best(selections)
//		String refBinder = bestSelection.getBinder();
		String refBinder = "Binder agent"; // to remove
		
		Message binding = new Binding(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
