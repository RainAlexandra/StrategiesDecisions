package strategiesdecisions.agreestrategies;

import java.util.HashSet;
import java.util.Set;

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
	
	private Set<Message> selections;
	
	public ImmediateAgreeImplicitReply(HashSet<Message> selections) {
		this.selections = selections;
	}

	public Set<Message> getSelections(){
		return selections;
	}

	public void setSelections(HashSet<Message> selections){
		this.selections = selections;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("immediate-Agreement-Implicit-Response");
//		List<Message> selections = comm.recevoirMessages(0); // destinataire = 0
//		Selection bestSelection = best(selections) -> 1
//		String binder = bestSelection.getBinder();
		
		Message binding = new Binding("1", "binder", "serviceRef1", "this is a binding agreement", 0);
		comm.envoyerMessage(binding);
		
		// S <- SN, SWA
	}
}
