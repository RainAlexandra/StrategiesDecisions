package strategiesdecisions.waitstrategies;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;
import strategiesdecisions.beans.Response;

/**
 * <b>SW1.2</b> - The agent only saves the messages (ad, reply, select, etc...) 
 * that surpass a certain threshold of interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImprovedWait implements IWaitStrategy {
	
	private String agent;
	private Map<MessageType, TreeSet<Message>> messages = new EnumMap<>(MessageType.class);
	
	public ImprovedWait(String agent){
		this.agent = agent;
		messages.put(MessageType.AD, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.RESPONSE, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.SELECTION, new TreeSet<>(new MessageComparator()));
		messages.put(MessageType.OTHER, new TreeSet<>(new MessageComparator()));
	}

	public void setMessages(EnumMap<MessageType, TreeSet<Message>> messages) {
		this.messages = messages;
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
	public Map<MessageType, TreeSet<Message>> executer(){
		System.out.println("improved-Wait");
		
//		lorsque l'agent recoit les messages on les sauvegarde selon leur type
		boolean wait = true;
		while (wait){
			// recuperation de chaque message recu par l'agent
			// List<Message> msgs = agent.getReceivedMsgs();
			
			// TESTS
			Message ad1 = new Ad("1", "1", "contents for an ad", 0);
			Message ad2 = new Ad("0", "1", "a test ad", 2);
			Message resp = new Response("1", "0", "i am a reply", 0);
			List<Message> msgs = new ArrayList<>();
			msgs.add(ad1); msgs.add(ad2); msgs.add(resp);
			//
			
			// F different pour chaque type de message?
			for (Message m : msgs){
				// if (F(m) >= seuil) {
					if (m.getMsgType() == MessageType.AD)
						messages.get(MessageType.AD).add(m);
					else if (m.getMsgType() == MessageType.RESPONSE)
						messages.get(MessageType.RESPONSE).add(m);
					else if (m.getMsgType() == MessageType.SELECTION)
						messages.get(MessageType.SELECTION).add(m);
					else
						messages.get(MessageType.OTHER).add(m);
				// }
			}
			wait = !wait;
		}
		System.out.println(printMsgs(messages));
		return messages;
	}
		
}
