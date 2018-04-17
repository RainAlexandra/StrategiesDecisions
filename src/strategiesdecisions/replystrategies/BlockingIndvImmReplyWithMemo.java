package strategiesdecisions.replystrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Message;
import strategiesdecisions.beans.Response;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR2.2</b> - Agent "Y" sends a Reply to the Ad sent by agent "X", 
 * considered to be of interest, and then blocks itself while continuing to receive other ads
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class BlockingIndvImmReplyWithMemo extends AReplyStrategy {

	public BlockingIndvImmReplyWithMemo(String agent, LinkedList<Message> ads) {
		super(agent, ads);
	}

	@Override
	public void executer(ICommunication comm){
		System.out.println("blocking-Targeted-Immediate-Response-Memorization");
	
//		Message bestAd = best(ads);
//		String bestTransmitter = bestAd.getTransmitter();
		String bestTransmitter = "X";
		
		Message reply = new Response(agent, bestTransmitter, "this is a reply message", 0);
		
		comm.envoyerMessage(reply);
		
		// se bloquer et stocker toute annonce
		// S <- S - SRP
		// ads <- Ad U {a} pour toute annonce a
	}
}
