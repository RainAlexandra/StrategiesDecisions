package strategiesdecisions.waitstrategies;

import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SN (SWA)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoWait implements IWaitStrategy {

	@Override
	public Map<MessageType, TreeSet<Message>> executer(){return null;}
}
