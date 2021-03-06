package Agree;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.SelectionMessage;
import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;
/**
 * <b>SAG2.1</b> - Agent "Y" does not immediately accept agent "X"'s binding
 * request but waits for a length of time "dt" to elapse. The binder agent
 * is then contacted in order for the physical binding to be done
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredAgreeImplicitReply implements IAgreeStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> selections;
    private int dt;

    public DeferredAgreeImplicitReply(ReferenceAgent agent, int dt) {
        this.agent = agent;
        this.dt = dt;
    }

    public DeferredAgreeImplicitReply(ArrayList<MessageAgent> selections) {
        this.selections = selections;
    }

    public void setSelections(ArrayList<MessageAgent> selections) {
        this.selections = selections;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ReferenceAgent agentBinder, ReferenceAgent recipient) {
        System.out.println("deferred-Agreement-Implicit-Response");
        MyLogger.log(Level.INFO, "Strategy{ Name= deferred-Agreement-Implicit-Response, Phase= AGREE}");

        while (dt > 0) {
            // on ne fait rien
            dt--;
        }

//		MessageAgent bestSelection = best(selections)
        MessageAgent bestSelection = selections.get(0); // to remove
        ReferenceAgent refBinder = ((SelectionMessage) bestSelection).getAgentBinder();

        //	MessageAgent binding = new BindingMessage("", "", "", "", 0);
        //	comm.envoyerMessage(binding);

        // S <- SN, SWA
    }
}
