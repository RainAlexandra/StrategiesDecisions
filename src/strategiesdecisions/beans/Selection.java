package strategiesdecisions.beans;

/**
 * Select type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Selection extends Message {
	
	private String binder; // refBinder

	public Selection(String transmitter, String recipient, String binder, String contents, int seqNum) {
		super(transmitter, recipient, contents, seqNum);
		this.binder = binder;
		this.setMsgType(MessageType.SELECTION);
	}

	public String getBinder() {
		return binder;
	}

	public void setBinder(String binder) {
		this.binder = binder;
	}
}
