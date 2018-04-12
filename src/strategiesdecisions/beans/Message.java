package strategiesdecisions.beans;

/**
 * Messages are used by agents in order to communicate with each other
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public abstract class Message {
	String transmittor; // refAgent transmittor
	String recipient; // refAgent recipient
	String contents;
	
	public String getTransmittor() {
		return transmittor;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public String getContents() {
		return contents;
	}

	public void setTransmittor(String transmittor) {
		this.transmittor = transmittor;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
