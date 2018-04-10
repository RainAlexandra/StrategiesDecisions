package strategiesdecisions;

/**
 * @author Rain-Alexandra BEGG
 * @version 0.1
 * <b>SAG</b> - The Agreement strategies depend on whether or not the agreement
 * is immediate or differed, explicit or implicit
 */
public interface IAgreeStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
