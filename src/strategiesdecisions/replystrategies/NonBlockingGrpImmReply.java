package strategiesdecisions.replystrategies;

import java.util.LinkedList;
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
	
	private String agent;
	private List<Message> ads;
	
	public NonBlockingGrpImmReply(String agent, LinkedList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}

	public List<Message> getAds(){
		return ads;
	}
	
	public void setAds(LinkedList<Message> ads) {
		this.ads = ads;
	}
	
	@Override
	public void executer(ICommunication comm){
		System.out.println("non-Blocking-Immediate-Grouped-Response");
		
		// how big is the group?
		// grpOfSenders = bestAds(ads);
		
//		Message reply;
		
		/*for (Agent a : grpOfSenders){
			reply = new Response(agent, a, "this is a reply msg", seqNum);
			comm.envoyerMessage(reply);
			// a chaque tour de boucle seqNum++
		}*/
		
		// S <- S
	}
}
