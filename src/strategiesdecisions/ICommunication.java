package strategiesdecisions;

import java.util.List;

public interface ICommunication {
	public void diffuserMessage(Message m);
	public void envoyerMessage(int emetteur, int desitinataire, Message m);
	public List<Message> recevoirMessage(int destinataire);
}