package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

public abstract class AAdStrategy {
	
	protected String agent;

	public AAdStrategy(String agent) {
		this.agent = agent;
	}
	
	public abstract void executer(ICommunication comm);
}
