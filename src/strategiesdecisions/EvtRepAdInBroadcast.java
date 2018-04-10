package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SA1.3</b> - The agent sends an ad to all the agents of the system. 
 * This action is can only be repeated once a particular event "e" occurs
 */
public class EvtRepAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer() {
		System.out.println("event-Repeated-Ad-In-Broadcast");
	}
}
