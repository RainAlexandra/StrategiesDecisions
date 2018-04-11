package strategiesdecisions;

import strategiesdecisions.adstrategies.IAdvertiseStrategy;

/**
 * <b>SN (SAD)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoAdvertise implements IAdvertiseStrategy {

	@Override
	public void executer(ICommunication comm){}
}
