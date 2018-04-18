package strategiesdecisions.waitstrategies;

import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.Utility;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SW2.3</b> - Combination between SW2.1 and SW2.2
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeEventLimitWait implements IWaitStrategy {

	private String agent;
	private Map<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	private int dt;
	
	public TimeEventLimitWait(String agent, int dt) {
		this.agent = agent;
		this.dt = dt;
	}
	
	@Override
	public Map<MessageType, TreeSet<Message>> executer(){
		System.out.println("time-Event-Limited-Wait");
		
		boolean event = false;
		do {
			// XOR:
			messages = (new Wait(agent)).executer();
			messages = (new ImprovedWait(agent)).executer();
			(new NoWait()).executer();
			//
			
			// List<Message> msgs = agent.getReceivedMsgs();
			event = Utility.findEvent(null);
			dt--;
			
			// S <- SW2.1
		} while (!event && dt > 0);
		// S <- S
		return messages;
	}
}
