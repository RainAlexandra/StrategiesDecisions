package strategiesdecisions.Reply;

import OCPlateforme.OCService;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SRP)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoReply implements IReplyStrategy {
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("This is No Reply Strategy!");
	}
}
