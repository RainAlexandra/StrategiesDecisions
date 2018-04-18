package strategiesdecisions.waitstrategies;

import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;

/**
 * <b>SW2.2</b> - SN XOR SW1.1 XOR SW1.2 (with a length of time "Dt")
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeLimitWait implements IWaitStrategy {

	private String agent;
	private Map<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	private int dt;
	
	public TimeLimitWait(String agent, int dt) {
		this.agent = agent;
		this.dt = dt;
	}

	@Override
	public Map<MessageType, TreeSet<Message>> executer(){
		System.out.println("time-Limited-Wait");
		
		while (dt > 0){
			// XOR:
			messages = (new Wait(agent)).executer();
			messages = (new ImprovedWait(agent)).executer();
			(new NoWait()).executer();
			//
			
			dt--;
			
			// S <- SW2.2
		}
		// S <- S
		return messages;
	}
}
