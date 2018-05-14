package Reply;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.IMessageAgent;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.ResponseMessage;
import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;
/**
 * <b>SR1.2</b> - Agent "Y" sends a reply to the advertisement of interest
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingGrpImmReply implements IReplyStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> ads;

    public NonBlockingGrpImmReply(ReferenceAgent agent) {
        this.agent = agent;
        //this.ads = ads;
    }

    public void setAds(ArrayList<MessageAgent> ads) {
        this.ads = ads;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> destinataires) {
        System.out.println("non-Blocking-Immediate-Grouped-Response");
        MyLogger.log(Level.INFO, "Strategy{ Name= non-Blocking-Immediate-Grouped-Response, Phase= Reply}");

        // how big is the group?
        // grpOfSenders = bestAds(ads);

//		Message reply;

		/*for (Agent a : grpOfSenders){
			reply = new Response(agent, a, "this is a reply msg", seqNum);
			comm.envoyerMessage(reply);
		}*/
        IMessageAgent reply = new ResponseMessage(service, agent, destinataires);
        comm.envoyerMessage(reply);
        // S <- S
    }
}
