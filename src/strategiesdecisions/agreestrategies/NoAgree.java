package strategiesdecisions.agreestrategies;

import java.util.LinkedList;

import strategiesdecisions.beans.Message;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SN (SAG)</b> - The agent does not take on any action regardless of 
 * the communication protocol's state/stage
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public class NoAgree extends AgreeStrategy {
	
	public NoAgree(String agent, LinkedList<Message> selections) {
		super(agent, selections);
	}

	@Override
	public void executer(ICommunication comm){}
}
