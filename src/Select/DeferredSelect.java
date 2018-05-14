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
 * <b>SSlc2</b> - Agent "X" does not immediately Select a reply. It waits for
 * a length of time "Dt", selects the reply of the highest interest
 * received within "Dt" and sends a "Select" message to the agent concerned
 * in order to trigger the Binding
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class DeferredSelect implements ISelectStrategy {

    private ReferenceAgent agent;
    private ArrayList<MessageAgent> responses;
    private int dt;

    public DeferredSelect(ReferenceAgent agent, int dt) {
        this.agent = agent;
        //this.responses = responses;
        this.dt = dt;
    }

    public void setResponses(ArrayList<MessageAgent> responses) {
        this.responses = responses;
    }

    @Override
    public void executer(ICommunication comm, OCService service,ArrayList<ReferenceAgent> recipients) {
        System.out.println("deferred-Select");
        MyLogger.log(Level.INFO, "Strategy{ Name= deferred-Select, Phase= SELECT}");
        while (dt > 0) {
            // responses <- responses U {r} pour toute reponse r
            // S <- S - SSL
            dt--;
        }

//		MessageAgent bestReply = best(responses);
    //    MessageAgent bestReply = responses.get(0); // to remove
    //    ReferenceAgent bestTransmitter = bestReply.getExpediteur();

        ReferenceAgent refBinder = new ReferenceAgent(); // TOdO walid : mettre en place la création de l'agent binder -

//		the binder will be created and initialized with the service of the advertising agent
// MessageAgent binding = new BindingMessage("", "", "", "", 0);

       // ArrayList<ReferenceAgent> recipient = new ArrayList<>();
       // recipient.add(bestTransmitter);
        MessageAgent selection = new SelectionMessage(service, agent, refBinder, recipients);

        // comm.envoyerMessage(binding);
        comm.envoyerMessage(selection);

        // S <- SN, SWA
    }
}
