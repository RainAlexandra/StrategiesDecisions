package strategiesdecisions.agreestrategies;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG1.1</b> - Agent "Y" accepts the binding request made by agent "X" and
 * contacts the binder agent in order for the physical binding to be done
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeImplicitReply implements IAgreeStrategy {
	
	private List<Message> selections;
	
	public ImmediateAgreeImplicitReply(LinkedList<Message> selections) {
		this.selections = selections;
	}

	public List<Message> getSelections(){
		return selections;
	}

	public void setSelections(LinkedList<Message> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Implicit-Response");
//		List<Message> selections = comm.recevoirMessages(0); // destinataire = 0
//		Selection bestSelection = best(selections) -> 1
//		String refBinder = bestSelection.getBinder();
		
		Message binding = new Binding("Y", "refBinder", "serviceRef_Y", "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
