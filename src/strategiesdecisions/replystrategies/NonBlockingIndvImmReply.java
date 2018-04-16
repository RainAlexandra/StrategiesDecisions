package strategiesdecisions.replystrategies;

import java.util.List;
import java.util.LinkedList;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.*;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent 
 * the advertisement of most interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {
	private List<Message> ads;
	
	public NonBlockingIndvImmReply(LinkedList<Message> ads) {
		this.ads = ads;
	}

	public List<Message> getAds(){
		return ads;
	}
	
	public void setAds(LinkedList<Message> ads) {
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Targeted-Immediate-Response");
//		ads = comm.recevoirMessages(0); // destinataire = 0
		// bestSender = best(ads); -> 1
		
		Message reply = new Response("Y", "X", "this is a reply message", 0);
		
//		comm.envoyerMessage(0, 1, reply);
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
