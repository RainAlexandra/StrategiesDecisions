package strategiesdecisions.replystrategies;

import java.util.ArrayList;
import java.util.List;

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
	
	public NonBlockingIndvImmReply(String agent, ArrayList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(List<Message> ads){
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Targeted-Immediate-Response");

//		Message bestAd = best(ads);
		Message bestAd = ads.get(0); // to remove
		String bestTransmitter = bestAd.getTransmitter();
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
