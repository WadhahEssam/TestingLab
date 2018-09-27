package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionsTest {
	Functions functions = new Functions();

	@Test
	public void devideTest() {
		int actual = functions.divide(6, 2);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public  void concateTest() {
		String actual = functions.concat("first", "second");
		String expected = "firstsecond"; 
		assertEquals(expected,actual);
	}

}
