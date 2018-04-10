package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SAD</b> - The advertisement strategies depend on whether or not an ad is
 * diffused to all agents or to a subset of agents, whether or not an ad is 
 * diffused only once or many times, and in this case, if it is diffused after
 * a timeout and/or after an event and if the ad is put into a directory or not
 */
public interface IAdvertiseStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
