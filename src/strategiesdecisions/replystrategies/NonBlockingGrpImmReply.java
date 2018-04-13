package strategiesdecisions.replystrategies;

import java.util.ArrayList;
import java.util.List;

import strategiesdecisions.beans.Message;
//import strategiesdecisions.beans.Response;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR1.2</b> - Agent "Y" sends a reply to the advertisement of interest 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingGrpImmReply implements IReplyStrategy {
	
	private List<Message> ads;
	
	public NonBlockingGrpImmReply(ArrayList<Message> ads) {
		this.ads = ads;
	}

	public List<Message> getAds(){
		return ads;
	}
	
	public void setAds(ArrayList<Message> ads) {
		this.ads = ads;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Immediate-Grouped-Response");
		
		// how big is the group?
		// grpOfSenders = bestAds(ads);
		
//		Message reply;
		
		/*for (Agent a : grpOfSenders){
			reply = new Response(calling_agent, a, "this is a reply msg", seqNum);
			comm.envoyerMessage(reply);
			// a chaque tour de boucle seqNum++
		}*/
		
		// S <- S
	}
}
