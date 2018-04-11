package strategiesdecisions.waitstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SWA</b> - The Wait strategies depend on whether or not all messages are saved or just 
 * a subset and whether or not the wait ends after a certain length of time 
 * and/or after the occurrence of an event
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IWaitStrategy {
	public void executer(ICommunication comm);
}