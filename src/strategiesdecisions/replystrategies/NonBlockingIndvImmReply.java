package strategiesdecisions.replystrategies;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;
import java.util.List;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent 
 * the advertisement of most interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Targeted-Immediate-Response");
		List<Message> ads = comm.recevoirMessages(0); // destinataire = 0
		// bestSender = best(ads); -> 1
		Message reply = new Response();
		comm.envoyerMessage(0, 1, reply);
	}
}
