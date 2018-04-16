package strategiesdecisions.selectstrategies;

import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class SelectStrategy {
	
	protected String agent;
	protected List<Message> responses;
	
	public SelectStrategy(String agent, List<Message> responses) {
		this.agent = agent;
		this.responses = responses;
	}

	public List<Message> getResponses() {
		return responses;
	}

	public void setResponses(List<Message> responses) {
		this.responses = responses;
	}
	
	public abstract void executer(ICommunication comm);
}
