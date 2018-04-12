package strategiesdecisions.waitstrategies;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.TreeSet;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SW1.1</b> - The agent saves all received messages 
 * (ad, reply, select, etc...) 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Wait implements IWaitStrategy {
	private enum MessageType { AD, AGREEMENT, RESPONSE, SELECTION }
	
	private class MessageComparator implements Comparator<Message> {

		@Override
		public int compare(Message msg1, Message msg2) {
			// maybe sort by interest?
			int comparison = 0;
			String contentsMsg1 = msg1.getContents();
			String contentsMsg2 = msg2.getContents();
			comparison = contentsMsg1.compareTo(contentsMsg2);
			return comparison;
		}
	}
	
	private EnumMap<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);  
	
	public void setMessages(MessageType msgType, Message msg){
		TreeSet<Message> msgSet = messages.get(msgType);
		msgSet.add(msg);
		this.messages.put(msgType, msgSet);
	}

	public Wait(){
		messages.put(MessageType.AD, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.AGREEMENT, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.RESPONSE, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.SELECTION, new TreeSet<>(new MessageComparator()));
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("wait");
		TreeSet<Message> ads = messages.get(MessageType.AD);
		Message ad = new Ad();
		ad.setContents("contents");
		ads.add(ad);
		messages.put(MessageType.AD, ads);
	}
}
