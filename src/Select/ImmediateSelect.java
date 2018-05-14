package Select;
import java.util.ArrayList;
import java.util.logging.Level;

import OCPlateforme.OCService;
import Utilitaire.MyLogger;
import strategiesdecisions.Message.MessageAgent;
import strategiesdecisions.Message.ReferenceAgent;
import strategiesdecisions.Message.SelectionMessage;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SSlc1</b> - Agent "X" selects a response that it considers of interest,
 * sends a "select" message to the agent in question and triggers the binding
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class ImmediateSelect implements ISelectStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> responses;

    public ImmediateSelect(ReferenceAgent agent) {
        this.agent = agent;
        // this.responses = responses;
    }

    public void setResponses(ArrayList<MessageAgent> responses) {
        this.responses = responses;
    }

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> recipients) {
        System.out.println("immediate-Select");
        MyLogger.log(Level.INFO, "Strategy{ Name= immediate-Select, Phase= SELECT}");

//		Message bestReply = best(replies);
     //   MessageAgent bestReply = responses.get(0); // to remove
    //    ReferenceAgent bestTransmitter = bestReply.getExpediteur();

        ReferenceAgent refBinder = new ReferenceAgent(); // ToDO walid générer la référence de l'agent Binder --  to remove

//		the binder will be created and initialized with the service of the advertising agent
        //MessageAgent binding = new BindingMessage("", "", "", "", 0);

    //    ArrayList<ReferenceAgent> recipient = new ArrayList<>();
    //    recipient.add(bestTransmitter);
        MessageAgent selection = new SelectionMessage(service, agent, refBinder, recipients);

        // comm.envoyerMessage(binding);
        comm.envoyerMessage(selection);

        // S <- SN, SWA
    }
}
