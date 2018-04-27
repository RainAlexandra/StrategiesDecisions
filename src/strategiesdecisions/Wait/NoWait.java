package strategiesdecisions.Wait;

import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.MessageType;

/**
 * <b>SN (SWA)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoWait implements IWaitStrategy {

	@Override
	public Map<MessageType, TreeSet<MessageAgent>> executer(){return null;}
}
