package strategiesdecisions.replystrategies;

import strategiesdecisions.communication.ICommunication;

/**
 * <b>SRP</b> - The Reply strategies depend on whether or not the reply is
 * immediate or not, if it is to an individual or to a group, non-blocking
 * or not, and if not whether or not replies are memorized or not
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IReplyStrategy {
	public void executer(ICommunication comm);
}
