package strategiesdecisions.communication;

import java.util.List;

import strategiesdecisions.beans.Message;

public interface ICommunication {
	public void diffuserMessage(Message m);
	public void envoyerMessage(int emetteur, int desitinataire, Message m);
	public List<Message> recevoirMessages(int destinataire);
}