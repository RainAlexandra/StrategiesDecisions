package strategiesdecisions.agreestrategies;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class AAgreeStrategy {

	protected String agent;
	protected List<Message> selections;
	
	public AAgreeStrategy(String agent){
		this.agent = agent;
		this.selections = null;
	}
	
	public AAgreeStrategy(String agent, LinkedList<Message> selections) {
		this.agent = agent;
		this.selections = selections;
	}

	public void setSelections(List<Message> selections) {
		this.selections = selections;
	}
	
	/**
	 * @param selectedTransmitter the transmitter whose message was selected
	 * @return the list of rejected selection transmitters
	 */
	public ArrayList<String> getRejectedSelectionTransmitters(String selectedTransmitter){
		ArrayList<String> rejectedTransmitters = new ArrayList<>();
		for (Message m : selections){
			String transmitter = m.getTransmitter();
			if (transmitter.compareTo(selectedTransmitter) != 0)
				rejectedTransmitters.add(transmitter);
		}
		return rejectedTransmitters;
	}
	
	public abstract void executer(ICommunication comm);
}
