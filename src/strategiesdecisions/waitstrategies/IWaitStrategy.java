package strategiesdecisions.waitstrategies;

import java.util.Comparator;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;
import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Selection;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SWA</b> - The Wait strategies depend on whether or not all messages are saved or just 
 * a subset and whether or not the wait ends after a certain length of time 
 * and/or after the occurrence of an event
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IWaitStrategy {
	
	/**
	 * Messages are sorted by (in order)
	 * <ol>
	 * 	<li>Sequence number</li>
	 * 	<li>Transmitter ID</li>
	 * 	<li>Recipient ID</li>
	 * 	<li>Service reference (if BINDING type)</li>
	 * 	<li>Binder Reference (if SELECTION type)</li>
	 * 	<li>Contents</li>
	 * </ol>
	 * @author Rain-Alexandra BEGG
	 * @version 0.1
	 */
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
			
			if (msg1.getMsgType().compareTo(MessageType.BINDING) == 0 
				&& msg2.getMsgType().compareTo(MessageType.BINDING) == 0){
				int compServ =0;
				String servMsg1 = ((Binding)msg1).getService();
				String servMsg2 = ((Binding)msg2).getService();
				compServ = servMsg1.compareTo(servMsg2);
				if (compServ != 0) return compServ;
			} else if (msg1.getMsgType().compareTo(MessageType.SELECTION) == 0
					&& msg2.getMsgType().compareTo(MessageType.SELECTION) == 0){
				int compBinder =0;
				String bindMsg1 = ((Selection)msg1).getBinder();
				String bindMsg2 = ((Selection)msg2).getBinder();
				compBinder = bindMsg1.compareTo(bindMsg2);
				if (compBinder != 0) return compBinder;
			}
			
			int compContents = 0;
			String contMsg1 = msg1.getContents();
			String contMsg2 = msg2.getContents();
			compContents = contMsg1.compareTo(contMsg2);			
			return compContents;
		}
	}
		
	public void executer(ICommunication comm);
}