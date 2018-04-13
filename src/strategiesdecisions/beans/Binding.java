package strategiesdecisions.beans;

/**
 * Binding request type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Binding extends Message {

	private String service; // refService
	
	public Binding(String transmitter, String recipient, String service, String contents, int seqNum){
		super(transmitter, recipient, contents, seqNum);
		this.service = service;
		this.setMsgType(MessageType.BINDING);
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
}
