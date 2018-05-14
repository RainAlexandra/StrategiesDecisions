package Reply;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.ReferenceAgent;

import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;
/**
 * <b>SN (SRP)</b> - The agent does not take on any action regardless of
 * the communication protocol's state/stage
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoReply implements IReplyStrategy {
    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> destinataires) {
        System.out.println("This is No Reply Strategy!");
        MyLogger.log(Level.INFO, "Strategy{ Name= no_Reply, Phase= Reply}");
    }
}
