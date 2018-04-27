package strategiesdecisions.replystrategies;

import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Response;

/**
 * <b>SR2.1</b> - Agent "Y" sends a Reply to the Ad sent by agent "X" 
 * considered to be of interest, and then blocks itself while ignoring all 
 * other ads
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public final class BlockingIndvImmReplyNoMemo implements IReplyStrategy {

	private String agent;
	private List<Message> ads;
	
	public BlockingIndvImmReplyNoMemo(String agent, ArrayList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(List<Message> ads) {
		this.ads = ads;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("blocking-Targeted-Immediate-Response-NMemorization");
	
//		Message bestAd = best(ads);
		Message bestAd = ads.get(0); // to remove
		String bestTransmitter = bestAd.getTransmitter();
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// se bloquer et ignorer toute annonce
		// S <- SRP
	}

	
}
