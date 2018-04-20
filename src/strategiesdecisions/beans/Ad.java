package strategiesdecisions.beans;

/**
 * Advertise type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Ad extends Message {

	
	/**
	 * diffusion version, there is no set recipient
	 */
	public Ad(String transmitter, String contents, int seqNum){
		super(transmitter, null, contents, seqNum);
		this.setMsgType(MessageType.AD);
	}
	
	public Ad(String transmitter, String recipient, String contents, int seqNum){
		super(transmitter, recipient, contents, seqNum);
		this.setMsgType(MessageType.AD);
	}
}
