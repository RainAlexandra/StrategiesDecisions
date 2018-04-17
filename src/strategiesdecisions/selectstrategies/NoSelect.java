package strategiesdecisions.selectstrategies;

import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SSL)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoSelect extends SelectStrategy {
	
	public NoSelect(String agent, List<Message> responses) {
		super(agent, responses);
	}

	@Override
	public void executer(ICommunication comm){}
}
