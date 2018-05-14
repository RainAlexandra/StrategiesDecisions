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
 * <b>SA2.1</b> - The agent sends an "Ad" message to a group (can be an
 * individual) of agents in the system
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class SingleAdInMulticast implements IAdvertiseStrategy {

    private ReferenceAgent agent;
    private ArrayList<ReferenceAgent> targetAgents = new ArrayList<>();

    // when initializing the SA2.1 strategy the list of agents is required for the multicast
    public SingleAdInMulticast(ReferenceAgent agent, ReferenceAgent... targetAgents) {
        this.agent = agent;
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
        System.out.println("single-Ad-In-Multicast");
        MyLogger.log(Level.INFO, "Strategy{ Name= single-Ad-In-Multicast, Phase= ADVERTISE}");
        MessageAgent ad = new AdMessage(service, agent, targetAgents);
        comm.diffuserMessage(ad);

        // S <- S - SAD
    }
}
