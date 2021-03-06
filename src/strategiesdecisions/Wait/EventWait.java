package strategiesdecisions.Wait;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.Utility;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.MessageType;
import strategiesdecisions.Message.ReferenceAgent;

/**
 * <b>SW2.1</b> - SN XOR SW1.1 XOR SW1.2
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EventWait implements IWaitStrategy {
	
	private ReferenceAgent agent;
	private Map<MessageType, TreeSet<MessageAgent>> messages = new EnumMap<>(MessageType.class);
	
	public EventWait(ReferenceAgent agent) {
		this.agent = agent;
	}
	
	@Override
	public Map<MessageType, TreeSet<MessageAgent>> executer(){
		System.out.println("event-Wait");
		
		boolean event = false;
		do {
			// XOR:
			messages = (new Wait(agent)).executer();
			messages = (new ImprovedWait(agent)).executer();
			(new NoWait()).executer();
			//
			
			// List<Message> msgs = agent.getReceivedMsgs();
			List<MessageAgent> msgs = null; // to remove
			event = Utility.findEvent(msgs);
			
			// S <- SW2.1
			
		} while (!event);
		
		// S <- S
		return messages;
	}
}
