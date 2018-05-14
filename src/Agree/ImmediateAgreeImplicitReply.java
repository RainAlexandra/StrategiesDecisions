package Agree;


import OCPlateforme.OCService;
import Utilitaire.MyLogger;

import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;

import strategiesdecisions.communication.ICommunication;

import java.util.ArrayList;
import java.util.logging.Level;
/**
 * <b>SAG1.1</b> - Agent "Y" accepts the binding request made by agent "X" and
 * contacts the binder agent in order for the physical binding to be done
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateAgreeImplicitReply implements IAgreeStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> selections;

    public ImmediateAgreeImplicitReply(ReferenceAgent agent) {
        this.agent = agent;
        // this.selections = selections;
    }

    public void setSelections(ArrayList<MessageAgent> selections) {
        this.selections = selections;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ReferenceAgent agentBinder, ReferenceAgent recipient) {
        System.out.println("immediate-Agreement-Implicit-Response");
        MyLogger.log(Level.INFO, "Strategy{ Name= immediate-Agreement-Implicit-Response, Phase= AGREE}");

//		Message bestSelection = best(selections);
      //  MessageAgent bestSelection = selections.get(0); // to remove
      //  ReferenceAgent refBinder = ((SelectionMessage) bestSelection).getAgentBinder();

        //MessageAgent binding = new BindingMessage("", "", "", "", 0);
        // comm.envoyerMessage(binding);
        MyLogger.log(Level.INFO, "Contacting "+agentBinder.toString()+ "} to start the binding ");
        // S <- SN, SWA
    }
}
