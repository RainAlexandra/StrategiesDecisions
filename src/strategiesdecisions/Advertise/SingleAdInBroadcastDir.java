package strategiesdecisions.Advertise;

import java.util.ArrayList;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.5</b> - The agent sends an "Ad" message to all the agents present 
 * in the system (non-replying agents are saved in the directory)
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
//TODO look over SA1.5 strategy description
public class SingleAdInBroadcastDir implements IAdvertiseStrategy {

	private String agent;
	private ArrayList<String> directory;
	
	public SingleAdInBroadcastDir(String agent, ArrayList<String> directory) {
		this.agent = agent;
		this.directory = directory;
	}
	
	

	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Broadcast-Directory");		
	}
}
