package strategiesdecisions.communication;

import java.util.List;

import strategiesdecisions.beans.Message;

/**
 * Allows the receipt and transmission of messages communicated between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * {@inheritDoc}
 */
public class Communication implements ICommunication {

	@Override
	public void diffuserMessage(Message m) {
		System.out.println("diffuser message");
	}

	@Override
	// public void envoyerMessage(int emetteur, int destinataire, Message m) {
	public void envoyerMessage(Message m){
		System.out.println("envoyer message de " + m.getTransmitter() + " à " + m.getRecipient() + 
				"\n    " + m.getContents() + "\n    seq = #" + m.getSeqNum());
		
	}

	@Override
	public List<Message> recevoirMessages(int destinataire) {
		System.out.println("recevoir message");
		return null;
	}
}
