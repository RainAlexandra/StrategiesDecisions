package strategiesdecisions;

public class TestClass {
	public static void main(String[] args) {
		IAdvertiseStrategies noAd = new NoAdvertise();
		IAdvertiseStrategies SA11 = new SingleAdInBroadcast();
		noAd.executer();
		SA11.executer();
	}
}
