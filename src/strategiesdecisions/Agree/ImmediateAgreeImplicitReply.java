package strategiesdecisions.Agree;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.SelectionMessage;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG1.1</b> - Agent "Y" accepts the binding request made by agent "X" and
 * contacts the binder agent in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeImplicitReply implements IAgreeStrategy {
	
	private String agent;
	private List<MessageAgent> selections;
	
	public ImmediateAgreeImplicitReply(String agent, ArrayList<MessageAgent> selections) {
		this.agent = agent;
		this.selections = selections;
	}

	public void setSelections(ArrayList<MessageAgent> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Implicit-Response");

//		Message bestSelection = best(selections);
		MessageAgent bestSelection = selections.get(0); // to remove
		String refBinder = ((SelectionMessage) bestSelection).getBinder();
		
		MessageAgent binding = new BindingMessage(agent, refBinder, "serviceRef_" + agent, "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
