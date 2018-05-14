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
 * <b>SA2.2</b> - The agent sends an "Ad" message to a group (can be an individual)
 * of agents in the system. This action can only be repeated after each "Dt" interval
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class TimeRepAdInMulticast implements IAdvertiseStrategy {

    private ReferenceAgent agent;
    private ArrayList<ReferenceAgent> targetAgents = new ArrayList<>();
    private int dt;

    // when initializing the SA2.2 strategy the list of agents is required for the multicast
    public TimeRepAdInMulticast(ReferenceAgent agent, int dt, ReferenceAgent... targetAgents) {
        this.agent = agent;
        this.dt = dt;
        for (ReferenceAgent a : targetAgents) {
            this.targetAgents.add(a);
        }
    }

    public void setTargetAgents(ArrayList<ReferenceAgent> agents) {
        this.targetAgents = agents;
    }

    public ArrayList<ReferenceAgent> getTargetAgents() {
        return targetAgents;
    }

    @Override
    public void executer(ICommunication comm, OCService service) {
        System.out.println("time-Repeated-Ad-In-Multicast");
        MyLogger.log(Level.INFO, "Strategy{ Name= time-Repeated-Ad-In-Multicast, Phase= ADVERTISE}");

        MessageAgent ad = new AdMessage(service, agent, targetAgents);
        comm.envoyerMessage(ad);

        while (dt > 0) {
            dt--;
            // S <- S - SAD
        }

        // S <- S
    }
}
