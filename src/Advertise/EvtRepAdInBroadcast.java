package Advertise;


import java.util.ArrayList;
import java.util.logging.Level;

import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;
/**
 * <b>SA1.3</b> - The agent sends an ad to all the agents of the system.
 * This action is can only be repeated once a particular event "e" occurs
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class EvtRepAdInBroadcast implements IAdvertiseStrategy {

    private ReferenceAgent agent;

    public EvtRepAdInBroadcast(ReferenceAgent agent) {
        this.agent = agent;
    }

    @Override
    public void executer(ICommunication comm, OCService service) {
        System.out.println("event-Repeated-Ad-In-Broadcast");
        MyLogger.log(Level.INFO, "event-Repeated-Ad-In-Broadcast");

        MessageAgent ad = new AdMessage(service, agent, null); // la liste des déstinataires est == null car en braodcast
        comm.diffuserMessage(ad);

        boolean event = false;
        do {
            // ArrayList<Message> msgs = agent.getReceivedMsgs();
            ArrayList<MessageAgent> msgs = null; // to remove
            // event = Utility.findEvent(msgs); // todo Walif : Refaire l'implémentation

            // S <- S - SAD
        } while (!event);
        //S <- S
    }
}
