package strategiesdecisions.selectstrategies;

import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class ASelectStrategy {
	
	protected String agent;
	protected List<Message> responses;
	
	public ASelectStrategy(String agent){
		this.agent = agent;
		this.responses = null;
	}
	
	public ASelectStrategy(String agent, List<Message> responses) {
		this.agent = agent;
		this.responses = responses;
	}

	public void setResponses(List<Message> responses) {
		this.responses = responses;
	}
	
	public abstract void executer(ICommunication comm);
}
