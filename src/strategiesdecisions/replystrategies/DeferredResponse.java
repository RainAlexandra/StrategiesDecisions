package strategiesdecisions.replystrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Response;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR3</b> - Agent "Y" does not immediately send a Reply but differs its 
 * reply for a length of time "Dt" and answers ones the ad of highest interest 
 * is received
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredResponse implements IReplyStrategy {
	
	private String agent;
	private List<Message> ads;
	private int dt;
	
	public DeferredResponse(String agent, ArrayList<Message> ads, int dt) {
		this.agent = agent;
		this.ads = ads;
		this.dt = dt;
	}

	public void setAds(List<Message> ads) {
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Response");
	
		System.out.println("Wait for " + dt + " cycles");
		while (dt > 0){
			// ads <- ads U {a} pour toute annonce a
			// S <- S - SRP
			dt--;
		}
		System.out.println("Wait over.");
		
//		setAds(agent.getAds());
//		Message bestAd = best(ads);
		Message bestAd = ads.get(0);
		String bestTransmitter = bestAd.getTransmitter();
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
