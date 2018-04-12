package strategiesdecisions.beans;

/**
 * Messages are used by agents in order to communicate with each other
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public abstract class Message {
	String transmitter; // refAgent transmitter
	String recipient; // refAgent recipient
	String contents;
	int seqNum;

	/**
	 * @param transmitter the transmitting agent of the message
	 * @param recipient the receiving agent of the message
	 * @param contents the contents of the message
	 * @param seqNum the sequence number of the message
	 */
	public Message(String transmitter, String recipient, String contents, int seqNum) {
		this.transmitter = transmitter;
		this.recipient = recipient;
		this.contents = contents;
		this.seqNum = seqNum;
	}

	public String getTransmitter() {
		return transmitter;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public String getContents() {
		return contents;
	}
	
	public int getSeqNum() {
		return seqNum;
	}

	public void settransmitter(String transmitter) {
		this.transmitter = transmitter;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}
}
