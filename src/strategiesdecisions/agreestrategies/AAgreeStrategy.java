package strategiesdecisions.agreestrategies;

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
	
	public abstract void executer(ICommunication comm);
}
