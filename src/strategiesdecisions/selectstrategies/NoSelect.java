package strategiesdecisions.selectstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SSL)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoSelect extends ASelectStrategy {
	
	public NoSelect(String agent) {
		super(agent);
	}

	@Override
	public void executer(ICommunication comm){}
}
