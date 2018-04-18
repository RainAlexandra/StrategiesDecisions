package strategiesdecisions.waitstrategies;

import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.Utility;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SW2.1</b> - SN XOR SW1.1 XOR SW1.2
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EventWait implements IWaitStrategy {
	
	private String agent;
	private Map<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	
	public EventWait(String agent) {
		this.agent = agent;
	}
	
	@Override
	public Map<MessageType, TreeSet<Message>> executer(){
		System.out.println("event-Wait");
		
		boolean event = false;
		do {
			// XOR:
			messages = (new Wait(agent)).executer();
			messages = (new ImprovedWait(agent)).executer();
			(new NoWait()).executer();
			//
			
			// List<Message> msgs = agent.getReceivedMsgs();
			event = Utility.findEvent(null);
			
			// S <- SW2.1
			
		} while (!event);
		
		// S <- S
		return messages;
	}
}
