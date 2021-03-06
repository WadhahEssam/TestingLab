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
	
	@Test
	public void sumTest() {
		int actual =  functions.sum(10, 20);
		int expected = 30;
		assertEquals(expected, actual);
	}
	
	@Test
	public void subTest() {
		int actual = functions.sub(10, 4);
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void isLeabYearTest() {
		boolean actual = functions.isLeabYear(2020);
		boolean expected = true;
		assertEquals(actual, expected);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void isNotLeabYearTest() {
		functions.isLeabYear(2021);
	}

}
