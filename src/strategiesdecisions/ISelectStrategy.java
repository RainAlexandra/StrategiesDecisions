package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SSL</b> - Two Select strategies are defined depending on whether or not
 * the selection is immediate or differed
 */
public interface ISelectStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
