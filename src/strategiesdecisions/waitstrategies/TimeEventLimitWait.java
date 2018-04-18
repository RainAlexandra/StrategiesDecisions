package strategiesdecisions.waitstrategies;

import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SW2.3</b> - Combination between SW2.1 and SW2.2
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEventLimitWait implements IWaitStrategy {

	@Override
	public Map<MessageType, TreeSet<Message>> executer(){return null;}
}
