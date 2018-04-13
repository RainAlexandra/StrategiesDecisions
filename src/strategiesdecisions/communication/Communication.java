package strategiesdecisions.communication;

import java.util.List;

import strategiesdecisions.beans.Binding;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.MessageType;
import strategiesdecisions.beans.Selection;

/**
 * Allows the receipt and transmission of messages communicated between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * {@inheritDoc}
 */
public class Communication implements ICommunication {

	@Override
	public void diffuserMessage(Message m) {
		System.out.println("diffuser " + m.getMsgType() + " message par " + m.getTransmitter() + 
				"\n    " + m.getContents() + "\n    seq = #" + m.getSeqNum() + "\n");
	}

	@Override
	// public void envoyerMessage(int emetteur, int destinataire, Message m) {
	public void envoyerMessage(Message m){
		String ret = "";
		if (m.getMsgType().compareTo(MessageType.BINDING) == 0){
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient() +
					" pour déclencher le binding physique \n    service = " + ((Binding)m).getService();
			
		} else if (m.getMsgType().compareTo(MessageType.SELECTION) == 0){
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient() +
					" pour déclencher le binding physique \n    binder = " + ((Selection)m).getBinder();
			
		} else {
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient();
				
		}
		ret += "\n    " + m.getContents() + "\n    seq = #" + m.getSeqNum() + "\n";
		System.out.println(ret);
	}

	@Override
	public List<Message> recevoirMessages(int destinataire) {
		System.out.println("recevoir messages");
		return null;
	}
}
