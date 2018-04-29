package strategiesdecisions.Advertise;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.5</b> - The agent sends an "Ad" message to a group of agents present 
 * in the directory
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
// TODO look over SA2.5 strategy description
public class SingleAdInMulticastDir implements IAdvertiseStrategy {
	
	private ReferenceAgent agent;
	private ArrayList<ReferenceAgent> directory;
	
	public SingleAdInMulticastDir(ReferenceAgent agent, ArrayList<ReferenceAgent> directory) {
		this.agent = agent;
		this.directory = directory;
	}

	

	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("single-Ad-In-Multicast-Directory");
	}
}
