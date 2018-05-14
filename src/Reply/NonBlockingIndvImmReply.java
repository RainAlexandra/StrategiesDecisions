package Reply;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.IMessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.ResponseMessage;
import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;

/**
 * <b>SR1.1</b> - Agent "Y" sends a reply to agent "X", having sent
 * the advertisement of most interest
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NonBlockingIndvImmReply implements IReplyStrategy {

    private ReferenceAgent agent;
    private ArrayList<IMessageAgent> ads;

    public NonBlockingIndvImmReply(ReferenceAgent agent) {
        this.agent = agent;
        //this.ads = ads;
    }


    public void setAds(ArrayList<IMessageAgent> ads) {
        this.ads = ads;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> destinataires) {
        System.out.println("non-Blocking-Targeted-Immediate-Response");
        MyLogger.log(Level.INFO, "Strategy{ Name= non-Blocking-Targeted-Immediate-Response, Phase= Reply}");

//		Message bestAd = best(ads);
        //	MessageAgent bestAd = ads.get(0); // to remove
        //	ArrayList<ReferenceAgent> bestTransmitter = new ArrayList<>();
        //	bestTransmitter.addAll(bestAd.getDestinataires());

        IMessageAgent reply = new ResponseMessage(service, agent, destinataires);
        comm.envoyerMessage(reply);

        // S <- S
    }
}
