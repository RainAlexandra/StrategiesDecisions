package strategiesdecisions.Wait;

import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.MessageType;
import strategiesdecisions.Message.ReferenceAgent;

/**
 * <b>SW2.2</b> - SN XOR SW1.1 XOR SW1.2 (with a length of time "Dt")
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeLimitWait implements IWaitStrategy {

	private ReferenceAgent agent;
	private Map<MessageType, TreeSet<MessageAgent>> messages = new EnumMap<>(MessageType.class);
	private int dt;
	
	public TimeLimitWait(ReferenceAgent agent, int dt) {
		this.agent = agent;
		this.dt = dt;
	}

	@Override
	public Map<MessageType, TreeSet<MessageAgent>> executer(){
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
