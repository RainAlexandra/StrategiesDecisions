package strategiesdecisions.replystrategies;

import java.util.LinkedList;

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
public class DeferredResponse extends AReplyStrategy {
	
	private int dt;
	
	public DeferredResponse(String agent, LinkedList<Message> ads, int dt) {
		super(agent, ads);
		this.dt = dt;
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("deferred-Response");
		
		while (dt > 0){
			(new NoReply(agent)).executer(comm); // on ne fait rien
			// ads <- ads U {a} pour toute annonce a
			// S <- S - SRP
			dt--;
		}
		
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X"; // to remove
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
