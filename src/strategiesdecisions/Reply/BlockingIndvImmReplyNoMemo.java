package strategiesdecisions.Reply;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ResponseMessage;
import strategiesdecisions.communication.ICommunication;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>SR2.1</b> - Agent "Y" sends a Reply to the Ad sent by agent "X" 
 * considered to be of interest, and then blocks itself while ignoring all 
 * other ads
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public final class BlockingIndvImmReplyNoMemo implements IReplyStrategy {

	private String agent;
	private List<MessageAgent> ads;
	
	public BlockingIndvImmReplyNoMemo(String agent, LinkedList<MessageAgent> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(List<MessageAgent> ads) {
		this.ads = ads;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("blocking-Targeted-Immediate-Response-NMemorization");
	
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X"; // to remove
		
		MessageAgent reply = new ResponseMessage(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// se bloquer et ignorer toute annonce
		// S <- SRP
	}

	
}
