package JUnitTestPackage;
//Devansh Choudhary E21CSEU0278

import static org.junit.Assert.*;

import org.junit.Test;

public class stringtest {

	@Test
	public void test() {
			functions obj = new functions();
	        String s1 = "hello";
	        String s2 = "buddy";
	        assertEquals("hellobuddy",obj.add_str(s1,s2));
	        
	}
	@Test
	public void test1() {
			functions obj = new functions();
	        String s1 = "hello";
	        String s2 = "buddy";
	        assertEquals("melonbud",obj.add_str(s1,s2));
	}

}
