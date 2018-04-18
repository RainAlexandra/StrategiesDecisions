package strategiesdecisions.waitstrategies;

import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SW2.1</b> - SN XOR SW1.1 XOR SW1.2
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EventWait implements IWaitStrategy {
	
	@Override
	public Map<MessageType, TreeSet<Message>> executer(){return null;}
}
