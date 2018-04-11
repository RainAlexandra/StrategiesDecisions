package strategiesdecisions.agreestrategies;

import strategiesdecisions.communication.Communication;
import strategiesdecisions.communication.ICommunication;

/**
 * <b>SAG</b> - The Agreement strategies depend on whether or not the agreement
 * is immediate or differed, explicit or implicit
 * @author Rain-Alexandra BEGG
 * @version 0.1
 */
public interface IAgreeStrategy {
	public void executer(ICommunication comm);
}
