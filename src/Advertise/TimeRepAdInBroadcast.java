package Advertise;

import java.util.logging.Level;

import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.AdMessage;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SA1.2</b> - The agent sends an "Ad" message to all the agents present in
 * the system. This action can only be repeated after each "dt" interval
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInBroadcast implements IAdvertiseStrategy {

    private ReferenceAgent agent;
    private int dt;

    public TimeRepAdInBroadcast(ReferenceAgent agent, int dt) {
        this.agent = agent;
        this.dt = dt;
    }

    @Override
    public void executer(ICommunication comm, OCService service) {
        System.out.println("time-Repeated-Ad-In-Broadcast");
        MyLogger.log(Level.INFO, "Strategy{ Name= time-Repeated-Ad-In-Broadcast, Phase= ADVERTISE}");

        MessageAgent ad = new AdMessage(service, agent, null); // the recipient list is null since this is a broadcast ad
        comm.diffuserMessage(ad);

        while (dt > 0) {
            dt--;
            // S <- S - SAD
        }

        // S <- S
    }
}
