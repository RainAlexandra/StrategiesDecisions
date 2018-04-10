package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SA1.4</b> - The agent sends an "Ad" message to all the agents present in 
 * the system. This action cannot be repeated until a particular event occurs 
 * or the defined interval of time has elapsed
 */
public class TimeEvtRepAdInBroadcast implements IAdvertiseStrategy {

	@Override
	public void executer() {
		System.out.println("time-Event-Repeated-Ad-In-Broadcast");
	}
}
