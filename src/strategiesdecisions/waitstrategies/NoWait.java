package strategiesdecisions.waitstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SWA)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoWait implements IWaitStrategy {

	@Override
	public void executer(ICommunication comm){}
}
