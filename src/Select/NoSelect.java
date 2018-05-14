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
 * <b>SN (SSL)</b> - The agent does not take on any action regardless of
 * the communication protocol's state/stage
 *
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoSelect implements ISelectStrategy {

    @Override
    public void executer(ICommunication comm, OCService service, ArrayList<ReferenceAgent> recipients) {
        System.out.println("This is No Select strategy");
        MyLogger.log(Level.INFO, "Strategy{ Name= no_Select, Phase= SELECT}");
    }
}
