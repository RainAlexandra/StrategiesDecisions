package strategiesdecisions.Reply;

import java.util.List;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ResponseMessage;
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
	private List<MessageAgent> ads;
	private int dt;
	
	public DeferredResponse(String agent, List<MessageAgent> ads, int dt) {
		this.agent = agent;
		this.ads = ads;
		this.dt = dt;
	}

	public void setAds(List<MessageAgent> ads) {
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Response");
	
		while (dt > 0){
			(new NoReply()).executer(comm); // on ne fait rien
			// ads <- ads U {a} pour toute annonce a
			// S <- S - SRP
			dt--;
		}
		
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X"; // to remove
		
		MessageAgent reply = new ResponseMessage(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
