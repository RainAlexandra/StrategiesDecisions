package strategiesdecisions.beans;

/**
 * Agree type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Agreement extends Message {

	public Agreement(String transmitter, String recipient, String contents, int seqNum) {
		super(transmitter, recipient, contents, seqNum);
		this.setMsgType(MessageType.AGREEMENT);
	}

}
