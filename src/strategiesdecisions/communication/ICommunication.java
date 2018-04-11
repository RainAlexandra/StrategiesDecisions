package strategiesdecisions.communication;

import java.util.List;
import strategiesdecisions.beans.Message;

/**
 * Allows receipt and transmission of messages communicated between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface ICommunication {
	/**
	 * sends a message from one agent to other agents
	 * @param m the message to be sent
	 */
	public void diffuserMessage(Message m);
	
	/**
	 * sends a message from one agent to another
	 * @param emetteur the transmitter of the message
	 * @param destinataire the recipient of the message
	 * @param m the message to be sent
	 */
	public void envoyerMessage(int emetteur, int destinataire, Message m);
	
	/**
	 * allows an agent to receive a list of messages
	 * @param destinataire the recipient of the messages
	 * @return list of messages received
	 */
	public List<Message> recevoirMessages(int destinataire);
}