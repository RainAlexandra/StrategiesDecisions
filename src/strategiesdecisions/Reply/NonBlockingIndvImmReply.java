package strategiesdecisions.Reply;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.Message.*;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent 
 * the advertisement of most interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {
	
	private String agent;
	List<MessageAgent> ads;
	
	public NonBlockingIndvImmReply(String agent, ArrayList<MessageAgent> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(List<MessageAgent> ads){
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Targeted-Immediate-Response");
//		Message bestAd = best(ads);
		MessageAgent bestAd = ads.get(0); // to remove
		String bestTransmitter = bestAd.getTransmitter();
		
		MessageAgent reply = new ResponseMessage(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
