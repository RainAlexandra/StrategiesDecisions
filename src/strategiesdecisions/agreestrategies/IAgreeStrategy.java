package strategiesdecisions.agreestrategies;

import strategiesdecisions.Communication;
import strategiesdecisions.ICommunication;

/**
 * <b>SAG</b> - The Agreement strategies depend on whether or not the agreement
 * is immediate or differed, explicit or implicit
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IAgreeStrategy {
	ICommunication comm = new Communication();
	public void executer();
}
