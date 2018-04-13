package strategiesdecisions.waitstrategies;

import java.util.Comparator;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SWA</b> - The Wait strategies depend on whether or not all messages are saved or just 
 * a subset and whether or not the wait ends after a certain length of time 
 * and/or after the occurrence of an event
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IWaitStrategy {
	
	class MessageComparator implements Comparator<Message> {
		@Override
		public int compare(Message msg1, Message msg2) {
			int compSeqNum = 0;
			Integer seqNumMsg1 = msg1.getSeqNum();
			Integer seqNumMsg2 = msg2.getSeqNum();
			compSeqNum = seqNumMsg1.compareTo(seqNumMsg2); // the latest or the oldest???
			if (compSeqNum != 0) return compSeqNum;
			
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
		
	public void executer(ICommunication comm);
}