package strategiesdecisions.tests.communication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import strategiesdecisions.beans.Ad;
import strategiesdecisions.beans.Message;

public class CommunicationTest {
	Message ad;
	
	@Before
	public void setUp() throws Exception {
		ad = new Ad("0", "1", "test ad", 0);
	}

	@Test
	public void testDiffuserMessage(){
		fail("Not yet implemented");
	}

	@Test
	public void testEnvoyerMessage(){
		fail("Not yet implemented");
	}

}
