package strategiesdecisions.communication;

import java.util.List;
import java.util.Optional;

import strategiesdecisions.Message.IMessageAgent;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;

/**
 * Allows the receipt and transmission of messages communicated between agents
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface ICommunication {
	/**
	 * sends a message from one agent to other agents
	 * @param m the message to be sent
	 */
	public void diffuserMessage(IMessageAgent message);
	
	/**
	 * sends a message from one agent to another
	 * @param m the message to be sent
	 */

	public void envoyerMessage(IMessageAgent message);
	
	/**
	 * allows an agent to receive One message
	 * @param destinataire the recipient of the messages
	 * @return The message received
	 */
	Optional<IMessageAgent> recevoirMessage(ReferenceAgent destinataire);
	
	/**
	 * allows an agent to receive a list of messages
	 * @param destinataire the recipient of the messages
	 * @return list of messages received
	 */
	public List<IMessageAgent> recevoirMessages(ReferenceAgent destinataire);

    
}