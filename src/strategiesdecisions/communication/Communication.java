package strategiesdecisions.communication;

import java.util.List;
import java.util.Optional;

import strategiesdecisions.Message.BindingMessage;
import strategiesdecisions.Message.IMessageAgent;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.MessageType;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.SelectionMessage;

/**
 * Allows the receipt and transmission of messages communicated between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * {@inheritDoc}
 */
public class Communication implements ICommunication {

	@Override
	public void diffuserMessage(IMessageAgent message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void envoyerMessage(IMessageAgent message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<IMessageAgent> recevoirMessage(ReferenceAgent destinataire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IMessageAgent> recevoirMessages(ReferenceAgent destinataire) {
		// TODO Auto-generated method stub
		return null;
	}

	/* @Override
	public void diffuserMessage(MessageAgent m) {
		System.out.println("diffuser " + m.getMsgType() + " message par " + m.getTransmitter() + 
				"\n    " + m.getContents() + "\n    seq = #" + m.getSeqNum() + "\n");
	}

	@Override
	// public void envoyerMessage(int emetteur, int destinataire, Message m) {
	public void envoyerMessage(MessageAgent m){
		String ret = "";
		if (m.getMsgType().compareTo(MessageType.BINDING) == 0){
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient() +
					" pour déclencher le binding physique \n    service = " + ((BindingMessage)m).getService();
			
		} else if (m.getMsgType().compareTo(MessageType.SELECTION) == 0){
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient() +
					" pour déclencher le binding physique \n    binder = " + ((SelectionMessage)m).getBinder();
			
		} else {
			ret += "envoyer " + m.getMsgType() + " message de " + m.getTransmitter() + " à " + m.getRecipient();
				
		}
		ret += "\n    " + m.getContents() + "\n    seq = #" + m.getSeqNum() + "\n";
		System.out.println(ret);
	}

	@Override
	public List<MessageAgent> recevoirMessages(int destinataire) {
		System.out.println("recevoir messages");
		return null;
	}
	*/
	
}
