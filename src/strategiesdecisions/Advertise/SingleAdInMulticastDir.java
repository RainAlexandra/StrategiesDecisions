package strategiesdecisions.Advertise;

import java.util.ArrayList;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.5</b> - The agent sends an "Ad" message to a group of agents present 
 * in the directory
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
// TODO look over SA2.5 strategy description
public class SingleAdInMulticastDir implements IAdvertiseStrategy {
	
	private String agent;
	private ArrayList<String> directory;
	
	public SingleAdInMulticastDir(String agent, ArrayList<String> directory) {
		this.agent = agent;
		this.directory = directory;
	}

	

	@Override
	public void executer(ICommunication comm){
		System.out.println("single-Ad-In-Multicast-Directory");
	}
}
