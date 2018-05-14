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
 * <b>SR2.2</b> - Agent "Y" sends a Reply to the Ad sent by agent "X",
 * considered to be of interest, and then blocks itself while continuing to receive other ads
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class BlockingIndvImmReplyWithMemo implements IReplyStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> ads;

    public BlockingIndvImmReplyWithMemo(ReferenceAgent agent, ArrayList<MessageAgent> ads) {
        this.agent = agent;
        this.ads = ads;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> destinataires) {
        System.out.println("blocking-Targeted-Immediate-Response-Memorization");
        MyLogger.log(Level.INFO, "Strategy{ Name= blocking-Targeted-Immediate-Response-Memorization, Phase= Reply}");

//		MessageAgent bestAd = best(ads);
        MessageAgent bestAd = ads.get(0); // to remove
        ArrayList<ReferenceAgent> bestTransmitter = new ArrayList<>();
        bestTransmitter.add(bestAd.getExpediteur());

        MessageAgent reply = new ResponseMessage(service, agent, bestTransmitter);
        comm.envoyerMessage(reply);

        // se bloquer et stocker toute annonce
        // S <- S - SRP
        // ads <- Ad U {a} pour toute annonce a
    }
}
