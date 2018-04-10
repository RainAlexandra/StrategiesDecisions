package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SA2.4</b> - The agent sends an "Ad" message to a group (can be an individual) 
 * of agents in the system. This action cannot be repeated until a particular event 
 * occurs or the defined interval of time "Dt" has elapsed
 */
public class TimeEvtRepAdInMulticast implements IAdvertiseStrategy {
	
	@Override
	public void executer(){
		System.out.println("time-Event-Repeated-Ad-In-Multicast");
	}
}
