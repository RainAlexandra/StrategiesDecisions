package strategiesdecisions.Select;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.SelectionMessage;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc2</b> - Agent "X" does not immediately Select a reply. It waits for 
 * a length of time "Dt", selects the reply of the highest interest 
 * received within "Dt" and sends a "Select" message to the agent concerned
 * in order to trigger the Binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredSelect implements ISelectStrategy {

	private String agent;
	private List<MessageAgent> responses;
	private int dt;
	
	public DeferredSelect(String agent,ArrayList<MessageAgent> responses, int dt) {
		this.agent = agent;
		this.responses = responses;
		this.dt = dt;
	}

	public void setResponses(ArrayList<MessageAgent> responses) {
		this.responses = responses;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Select");
		
		while (dt > 0){
			// responses <- responses U {r} pour toute reponse r
			// S <- S - SSL
			dt--;
		}
		
//		String bestReply = best(replies);
//		String bestTransmitter = bestReply.getTransmitter();
		String bestTransmitter = "Y"; // to remove
		String refBinder = "Binder agent"; // to remove
		
//		the binder will be created and initialized with the service of the advertising agent
		MessageAgent binding = new BindingMessage(agent, refBinder, "serviceRef_" + agent, "this is a binding request", 0);
		MessageAgent selection = new SelectionMessage(agent, bestTransmitter, "Binder agent", "this is a selection message", 0);

		comm.envoyerMessage(binding);
		comm.envoyerMessage(selection);

		// S <- SN, SWA
	}
}
