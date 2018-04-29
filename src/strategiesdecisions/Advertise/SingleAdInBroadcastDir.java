package strategiesdecisions.Advertise;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.5</b> - The agent sends an "Ad" message to all the agents present 
 * in the system (non-replying agents are saved in the directory)
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
//TODO look over SA1.5 strategy description
public class SingleAdInBroadcastDir implements IAdvertiseStrategy {

	private ReferenceAgent agent;
	private ArrayList<ReferenceAgent> directory;
	
	public SingleAdInBroadcastDir(ReferenceAgent agent, ArrayList<ReferenceAgent> directory) {
		this.agent = agent;
		this.directory = directory;
	}

	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("single-Ad-In-Broadcast-Directory");		
	}
}
