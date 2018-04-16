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
	
	private String agent;
	private List<Message> ads;
	
	public NonBlockingIndvImmReply(String agent, LinkedList<Message> ads) {
		this.agent = agent;
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
//		ads = comm.recevoirMessages(0); // destinataire = Y
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X"; // to remove
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
