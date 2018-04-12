package strategiesdecisions.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Messages are used by agents in order to communicate with each other
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public abstract class Message {
	String transmitter; // refAgent transmittor
	String recipient; // refAgent recipient
	String contents;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date dateTime;

	/**
	 * @return the transmitting agent ID of the message
	 */
	public String getTransmittor() {
		return transmitter;
	}
	
	/**
	 * @return the receiving agent ID of the message
	 */
	public String getRecipient() {
		return recipient;
	}
	
	/**
	 * @return the contents of a message
	 */
	public String getContents() {
		return contents;
	}
	
	/**
	 * @return the date and time of transmission (in dd/MM/yyyy HH:mm:ss format) 
	 * of the message
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param transmittor the new ID of the transmitting agent
	 */
	public void setTransmittor(String transmittor) {
		this.transmitter = transmittor;
	}

	/**
	 * @param recipient the new ID of the receiving agent
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * @param contents the new contents of the message
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * @param dateTime the new date and time of transmission of the message
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	public static void main(String[] args) {
		sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // removes time zone issues
		System.out.println(sdf.format(new Date()));
		
	}
}
