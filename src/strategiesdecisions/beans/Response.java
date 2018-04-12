package strategiesdecisions.beans;

/**
 * Reply type message
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class Response extends Message {

	public Response(String transmitter, String recipient, String contents, int seqNum) {
		super(transmitter, recipient, contents, seqNum);
	}
}