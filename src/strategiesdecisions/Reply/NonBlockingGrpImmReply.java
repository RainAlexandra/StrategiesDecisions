package strategiesdecisions.Reply;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.Message.MessageAgent;
//import strategiesdecisions.beans.Response;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR1.2</b> - Agent "Y" sends a reply to the advertisement of interest 
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingGrpImmReply implements IReplyStrategy {
	
	private String agent;
	private List<MessageAgent> ads;
	
	public NonBlockingGrpImmReply(String agent, ArrayList<MessageAgent> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(ArrayList<MessageAgent> ads) {
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
		}*/
		
		// S <- S
	}
}
