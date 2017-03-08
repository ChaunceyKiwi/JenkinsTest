import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {

	   String message = "Hello World";	
	   EchoChamber echoChamber = new EchoChamber(message);

	   @Test
	   public void testPrintMessage() {
		  message = "New World"; 
	      assertEquals(message, echoChamber.sendBackSound());
	   }

}
