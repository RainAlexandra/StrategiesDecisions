package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SRP</b> - The Reply strqtegies depend on whether or not the reply is
 * immediate or not, if it is to an individual or to a group, non-blocking
 * or not, and if not whether or not replies or memorized or not
 */
public interface IReplyStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
