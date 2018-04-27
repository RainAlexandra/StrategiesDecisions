package strategiesdecisions.replystrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Response;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR2.3</b> - Agent "Y" sends a Reply to the Ad sent by agent "X", considered to be of interest, 
 * and then blocks itself while continuing to receive other ads and saving those that are considered 
 * to be of interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class BlockingIndvImmReplyImprovedMemo implements IReplyStrategy {

	private String agent;
	private List<Message> ads;
	
	public BlockingIndvImmReplyImprovedMemo(String agent, ArrayList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}
		
	public void setAds(List<Message> ads) {
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("blocking-Targeted-Immediate-Response-Improved-Memorization");
	
//		Message bestAd = best(ads);
		Message bestAd = ads.get(0); // to remove
		String bestTransmitter = bestAd.getTransmitter();
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// se bloquer et stocker toute annonce interessante (fonction F)
		// S <- S - SRP
		// ads <- Ad U {a} pour toute annonce a tq F(a) > seuil
	}
}
