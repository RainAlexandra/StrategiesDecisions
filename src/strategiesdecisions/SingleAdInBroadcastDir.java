package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SA1.5</b> - The agent sends an "Ad" message to all the agents present 
 * in the system (non-replying agents are saved in the directory)
 */
public class SingleAdInBroadcastDir implements IAdvertiseStrategy {

	@Override
	public void executer() {
		System.out.println("single-Ad-In-Broadcast-Directory");		
	}
}
