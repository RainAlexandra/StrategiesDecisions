package strategiesdecisions.Message;

import java.util.ArrayList;

import OCPlateforme.OCService;

/**
 * Binding request type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class BindingMessage extends MessageAgent {

	
	public BindingMessage(String transmitter, String recipient, String service, String contents, int seqNum){
		// super(transmitter, recipient, contents, seqNum);
		//this.service = service;
		//this.setMsgType(MessageType.BINDING);
	}

	public OCService getService() {
		return service;
	}

	@Override
	public ReferenceAgent getExpediteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReferenceAgent> getDestinataires() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractPerception toPerception() {
		// TODO Auto-generated method stub
		return null;
	}
}
