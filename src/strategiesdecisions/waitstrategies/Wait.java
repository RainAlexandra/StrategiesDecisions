package strategiesdecisions.waitstrategies;

import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;

import java.util.Set;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SW1.1</b> - The agent saves all received messages 
 * (ad, reply, select, etc...) 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Wait implements IWaitStrategy {
	
//	private enum MessageType { AD, RESPONSE, SELECTION, OTHER }
	
//	private class MessageComparator implements Comparator<Message> {
//		@Override
//		public int compare(Message msg1, Message msg2) {
//			int compSeqNum = 0;
//			Integer seqNumMsg1 = msg1.getSeqNum();
//			Integer seqNumMsg2 = msg2.getSeqNum();
//			compSeqNum = seqNumMsg1.compareTo(seqNumMsg2); // the latest or the oldest???
//			if (compSeqNum != 0) return compSeqNum;
//			
//			int compTrans = 0;
//			String transMsg1 = msg1.getTransmitter();
//			String transMsg2 = msg2.getTransmitter();
//			compTrans = transMsg1.compareTo(transMsg2);
//			if (compTrans != 0) return compTrans;
//			
//			int compRec = 0;
//			String recMsg1 = msg1.getRecipient();
//			String recMsg2 = msg2.getRecipient();
//			compTrans = recMsg1.compareTo(recMsg2);
//			if (compRec != 0) return compRec;
//			
//			int compContents = 0;
//			String contMsg1 = msg1.getContents();
//			String contMsg2 = msg2.getContents();
//			compContents = contMsg1.compareTo(contMsg2);			
//			return compContents;
//		}
//	}
//	
	private Map<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	
	public void setMessages(EnumMap<MessageType, TreeSet<Message>> messages) {
		this.messages = messages;
	}

	public Wait(){
		messages.put(MessageType.AD, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.RESPONSE, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.SELECTION, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.OTHER, new TreeSet<>(new MessageComparator()));
	}

	private String printMsgs(Map<MessageType, TreeSet<Message>> msgs){
		String ret = "";
		Set<MessageType> msgTypes = msgs.keySet();
		for (MessageType msgType : msgTypes){
			ret += msgType + "\n";
			TreeSet<Message> msgsOfType = msgs.get(msgType);
			for (Message m : msgsOfType){
				ret += m.getTransmitter() + "->" + m.getRecipient() + " - " + m.getContents() + " - " + m.getSeqNum() + "\n";
			}
		}
		return ret;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("wait");
		TreeSet<Message> ads = messages.get(MessageType.AD);
		TreeSet<Message> responses = messages.get(MessageType.RESPONSE);
		Message ad1 = new Ad("1", "1", "contents for an ad", 0);
		Message ad2 = new Ad("0", "1", "a test ad", 2);
		Message resp = new Response("1", "0", "i am a reply", 0);
		ads.add(ad1);
		ads.add(ad2);
		responses.add(resp);
		System.out.println(printMsgs(messages));
	}
}
