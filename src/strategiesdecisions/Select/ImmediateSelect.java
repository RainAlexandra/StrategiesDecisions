package strategiesdecisions.Select;

import OCPlateforme.OCService;

import java.util.ArrayList;

import strategiesdecisions.Message.*;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc1</b> - Agent "X" selects a response that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateSelect implements ISelectStrategy {
	
	private ReferenceAgent agent;
	private ArrayList<MessageAgent> responses;
	
	public ImmediateSelect(ReferenceAgent agent, ArrayList<MessageAgent> responses){
		this.agent = agent;
		this.responses = responses;
	}

	public void setResponses(ArrayList<MessageAgent> responses){
		this.responses = responses;
	}
	
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("immediate-Select");

//		Message bestReply = best(replies);
		MessageAgent bestReply = responses.get(0); // to remove
		ReferenceAgent bestTransmitter = bestReply.getExpediteur();
		ReferenceAgent refBinder = new ReferenceAgent(); // to remove
		
//		the binder will be created and initialized with the service of the advertising agent
		MessageAgent binding = new BindingMessage("", "", "", "", 0);
		
		ArrayList<ReferenceAgent> recipient = new ArrayList<>();
		recipient.add(bestTransmitter);
		MessageAgent selection = new SelectionMessage(service, agent, refBinder, recipient);

		comm.envoyerMessage(binding);
		comm.envoyerMessage(selection);

		// S <- SN, SWA
	}
}
