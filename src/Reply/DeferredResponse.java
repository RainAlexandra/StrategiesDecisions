package Reply;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.ResponseMessage;
import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;
/**
 * <b>SR3</b> - Agent "Y" does not immediately send a Reply but differs its
 * reply for a length of time "Dt" and answers ones the ad of highest interest
 * is received
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredResponse implements IReplyStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> ads;
    private int dt;

    public DeferredResponse(ReferenceAgent agent, ArrayList<MessageAgent> ads, int dt) {
        this.agent = agent;
        this.ads = ads;
        this.dt = dt;
    }

    public void setAds(ArrayList<MessageAgent> ads) {
        this.ads = ads;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> destinataires) {
        System.out.println("deferred-Response");
        MyLogger.log(Level.INFO, "Strategy{ Name= deferred-Response, Phase= Reply}");

        while (dt > 0) {
            // ads <- ads U {a} pour toute annonce a
            // S <- S - SRP
            dt--;
        }

//		MessageAgent bestAd = best(ads);
        MessageAgent bestAd = ads.get(0); // to remove
        ArrayList<ReferenceAgent> bestTransmitter = new ArrayList<>();
        bestTransmitter.add(bestAd.getExpediteur());

        MessageAgent reply = new ResponseMessage(service, agent, bestTransmitter);
        comm.envoyerMessage(reply);

        // S <- S
    }
}
