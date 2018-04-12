package strategiesdecisions.beans;

/**
 * Select type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Selection extends Message {

	public Selection(String transmitter, String recipient, String contents, int seqNum) {
		super(transmitter, recipient, contents, seqNum);
	}
}
