package strategiesdecisions.agreestrategies;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class AgreeStrategy {

	protected String agent;
	protected List<Message> selections;
	
	public AgreeStrategy(String agent, LinkedList<Message> selections) {
		this.agent = agent;
		this.selections = selections;
	}

	public List<Message> getSelections() {
		return selections;
	}

	public void setSelections(List<Message> selections) {
		this.selections = selections;
	}
	
	public abstract void executer(ICommunication comm);
}
