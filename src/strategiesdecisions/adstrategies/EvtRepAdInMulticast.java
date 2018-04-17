package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA2.3</b> - The agent sends an ad to a group (can be an individual) of 
 * agents in the system. This action can only be repeated once a particular 
 * event "e" occurs
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInMulticast extends AAdStrategy {

	public EvtRepAdInMulticast(String agent) {
		super(agent);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("event-Repeated-Ad-In-Multicast");
	}
}
