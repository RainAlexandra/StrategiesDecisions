package strategiesdecisions.selectstrategies;

import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc2</b> - Agent "X" does not immediately Select a reply. It waits for 
 * a length of time "Dt", selects the reply of the highest interest 
 * received within "Dt" and sends a "Select" message to the agent concerned
 * in order to trigger the Binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredSelect extends ASelectStrategy {
	
	public DeferredSelect(String agent, List<Message> responses) {
		super(agent, responses);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Select");
	}
}
