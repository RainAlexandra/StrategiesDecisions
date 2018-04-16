package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

public abstract class AdStrategy {
	
	protected String agent;

	public AdStrategy(String agent) {
		this.agent = agent;
	}
	
	public abstract void executer(ICommunication comm);
}
