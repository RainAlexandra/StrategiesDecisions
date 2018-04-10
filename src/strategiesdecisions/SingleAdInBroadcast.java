package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SA1.1</b> - The agent sends an "Ad" message to all the agents present in 
 * the system
 */
public class SingleAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer() {
		System.out.println("single-Ad-In-Broadcast");
	}
}
