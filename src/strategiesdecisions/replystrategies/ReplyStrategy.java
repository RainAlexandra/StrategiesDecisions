package strategiesdecisions.replystrategies;

import java.util.LinkedList;
import java.util.List;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

public abstract class ReplyStrategy {
	
	protected String agent;
	protected List<Message> ads;
	
	public ReplyStrategy(String agent, LinkedList<Message> ads) {
		this.agent = agent;
		this.ads = ads;
	}

	public List<Message> getAds() {
		return ads;
	}

	public void setAds(List<Message> ads) {
		this.ads = ads;
	}
	
	public abstract void executer(ICommunication comm);
}
