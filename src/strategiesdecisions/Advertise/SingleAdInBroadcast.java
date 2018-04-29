package strategiesdecisions.Advertise;

import OCPlateforme.OCService;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.1</b> - The agent sends an "Ad" message to all the agents present in 
 * the system
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInBroadcast implements IAdvertiseStrategy {
	
	private ReferenceAgent agent;
	
	public SingleAdInBroadcast(ReferenceAgent agent) {
		this.agent = agent;
	}

	@Override
	public void executer(ICommunication comm, OCService service) {
		System.out.println("single-Ad-In-Broadcast");
		MessageAgent ad = new AdMessage(service, agent, null); // la liste des déstinataires est == null car en braodcast
		comm.diffuserMessage(ad);
		// S <- S - SAD
		
	}
}
