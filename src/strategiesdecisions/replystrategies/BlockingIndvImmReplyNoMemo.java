package strategiesdecisions.replystrategies;

import java.util.LinkedList;

import strategiesdecisions.communication.ICommunication;
import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Response;

/**
 * <b>SR2.1</b> - Agent "Y" sends a Reply to the Ad sent by agent "X" 
 * considered to be of interest, and then blocks itself while ignoring all 
 * other ads
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public final class BlockingIndvImmReplyNoMemo extends ReplyStrategy {

	public BlockingIndvImmReplyNoMemo(String agent, LinkedList<Message> ads) {
		super(agent, ads);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("blocking-Targeted-Immediate-Response-NMemorization");
	
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X"; // to remove
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// se bloquer et ignorer toute annonce
		// S <- SRP
	}

	
}
