package strategiesdecisions;

// Strategy ID = SR3
public class DeferredResponse implements IReplyStrategies {
	
	@Override
	public void executer(){
		System.out.println("deferred-Response");
	}
}
