package strategiesdecisions.Reply;

import java.util.ArrayList;

import OCPlateforme.OCService;
import strategiesdecisions.Message.*;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent 
 * the advertisement of most interest
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {
	
	private ReferenceAgent agent;
	private ArrayList<MessageAgent> ads;
	
	public NonBlockingIndvImmReply(ReferenceAgent agent, ArrayList<MessageAgent> ads) {
		this.agent = agent;
		this.ads = ads;
	}
	
	public void setAds(ArrayList<MessageAgent> ads){
		this.ads = ads;
	}

	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("non-Blocking-Targeted-Immediate-Response");
		
//		Message bestAd = best(ads);
		MessageAgent bestAd = ads.get(0); // to remove
		ArrayList<ReferenceAgent> bestTransmitter = new ArrayList<>();
		bestTransmitter.add(bestAd.getExpediteur());
		
		MessageAgent reply = new ResponseMessage(service, agent, bestTransmitter);		
		comm.envoyerMessage(reply);
		
		// S <- S
	}
}
