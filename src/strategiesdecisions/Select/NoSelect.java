package strategiesdecisions.Select;

import OCPlateforme.OCService;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SSL)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoSelect implements ISelectStrategy {
	
	@Override
	public void executer(ICommunication comm, OCService service){
		System.out.println("This is No Select strategy");
	}
}
