package strategiesdecisions.adstrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAD</b> - The advertisement strategies depend on whether or not an ad is
 * diffused to all agents or to a subset of agents, whether or not an ad is 
 * diffused only once or many times, and in the latter case, if it is repeated 
 * after a length of time and/or after an event and if the ad is put into a 
 * directory or not
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IAdvertiseStrategy {
	public void executer(ICommunication comm);
}
