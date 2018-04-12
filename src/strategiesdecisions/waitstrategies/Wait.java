package strategiesdecisions.waitstrategies;

import java.util.Date;
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
	private enum MessageType { AD, RESPONSE, SELECTION, OTHER }
	
	private class MessageComparator implements Comparator<Message> {
		@Override
		public int compare(Message msg1, Message msg2) {
			int compDate = 0;
			Date dateMsg1 = msg1.getDateTime();
			Date dateMsg2 = msg2.getDateTime();
			compDate = dateMsg1.compareTo(dateMsg2);
			if (compDate != 0) return compDate;
			
			int compTrans = 0;
			String transMsg1 = msg1.getTransmitter();
			String transMsg2 = msg2.getTransmitter();
			compTrans = transMsg1.compareTo(transMsg2);
			if (compTrans != 0) return compTrans;
			
			int compRec = 0;
			String recMsg1 = msg1.getRecipient();
			String recMsg2 = msg2.getRecipient();
			compTrans = recMsg1.compareTo(recMsg2);
			if (compRec != 0) return compRec;
			
			int compContents = 0;
			String contMsg1 = msg1.getContents();
			String contMsg2 = msg2.getContents();
			compContents = contMsg1.compareTo(contMsg2);			
			return compContents;
		}
	}
	
	private EnumMap<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	
	public void setMessages(EnumMap<MessageType, TreeSet<Message>> messages) {
		this.messages = messages;
	}

	public Wait(){
		messages.put(MessageType.AD, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.RESPONSE, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.SELECTION, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.OTHER, new TreeSet<>(new MessageComparator()));
	}

	private String printMsgs(TreeSet<Message> msgs){
		String ret = "";
		for (Message m : msgs){
			ret += m.getContents() + ", ";
		}
		return ret;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("wait");
		TreeSet<Message> ads = messages.get(MessageType.AD);
		Message ad1 = new Ad();
		Message ad2 = new Ad();
		ad1.setContents("contents");
		ad2.setContents("a test ad");
		ads.add(ad1);
		ads.add(ad2);
		System.out.println(printMsgs(messages.get(MessageType.AD)));
		System.out.println(printMsgs(messages.get(MessageType.OTHER)));
	}
}
