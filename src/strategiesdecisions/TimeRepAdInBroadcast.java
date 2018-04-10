package strategiesdecisions;

/**
 * <b>SA1.2</b> - The agent sends an "Ad" message to all the agents present in
 * the system. This action can only be repeated after each "Dt" interval
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer() {
		System.out.println("time-Repeated-Ad-In-Broadcast");
	}
}
