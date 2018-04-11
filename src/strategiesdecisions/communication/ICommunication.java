package strategiesdecisions.communication;

import java.util.List;
import strategiesdecisions.beans.Message;

/**
 * Allows message reception and sending between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface ICommunication {
	public void diffuserMessage(Message m);
	public void envoyerMessage(int emetteur, int destinataire, Message m);
	public List<Message> recevoirMessages(int destinataire);
}