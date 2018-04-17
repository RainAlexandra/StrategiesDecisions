package strategiesdecisions.replystrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SRP)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoReply extends ReplyStrategy {
	
	public NoReply(String agent, LinkedList<Message> ads) {
		super(agent, ads);
	}

	@Override
	public void executer(ICommunication comm){}
}
