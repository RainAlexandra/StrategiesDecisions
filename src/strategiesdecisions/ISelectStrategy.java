package strategiesdecisions;

/**
 * <b>SSL</b> - Two Select strategies are defined depending on whether or not
 * the selection is immediate or differed
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface ISelectStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
