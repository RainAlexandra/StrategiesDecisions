package strategiesdecisions.replystrategies;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class AReplyStrategy {
	
	protected String agent;
	protected List<Message> ads;
	
	public AReplyStrategy(String agent){
		this.agent = agent;
		this.ads = null;
	}
	
	public AReplyStrategy(String agent, LinkedList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}

	public void setAds(List<Message> ads) {
		this.ads = ads;
	}
	
	public abstract void executer(ICommunication comm);
}
