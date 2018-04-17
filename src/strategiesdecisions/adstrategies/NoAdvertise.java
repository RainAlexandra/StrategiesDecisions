package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SAD)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoAdvertise extends AdStrategy {

	public NoAdvertise(String agent) {
		super(agent);
	}

	@Override
	public void executer(ICommunication comm){}
}
