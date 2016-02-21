package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	/**
	 * Check whether the memory allocation for object is done or not.
	 */
	public void testCalculator() {
		Calculator obj = new Calculator();
		assertNotNull("Object is NULL",obj);
	}

	@Test
	/**
	 * Check the initial total of the total variable 
	 */
	public void testGetTotalOne() {
		Calculator obj = new Calculator();
		assertEquals(obj.getTotal(),0);
	}
	
	/**
	 * Check the value of total variable after adding 6
	 */
	public void testGetTotalTwo() {
		Calculator obj = new Calculator();
		obj.add(6);
		assertEquals(obj.getTotal(),6);
	}
	
	@Test
	/**
	 * Check the value of the total variable after adding 10 
	 */
	public void testAdd() {
		Calculator obj = new Calculator();
		obj.add(10);
		assertEquals(obj.getTotal(),10);
	}

	@Test
	/**
	 * Check the value of the total variable after subtracting 10
	 */
	public void testSubtract() {
		Calculator obj = new Calculator();
		obj.subtract(10);
		assertEquals(obj.getTotal(),-10);
	}

	@Test
	/**
	 * Check the value of the total variable after multiplying with 10
	 */
	public void testMultiplyOne() {
		Calculator obj = new Calculator();
		obj.multiply(10);
		assertEquals(obj.getTotal(),0);
	}
	
	/**
	 * Check the value of the total variable after adding 1 and
	 * then multiplying by 10 
	 */
	public void testMultiplyTwo() {
		Calculator obj = new Calculator();
		obj.add(1);
		obj.multiply(10);
		assertEquals(obj.getTotal(),10);
	}
	@Test
	/**
	 * Check the value of the total variable after dividing by 10
	 */
	public void testDivideOne() {
		Calculator obj = new Calculator();
		obj.divide(10);
		assertEquals(obj.getTotal(),0);
	}
	
	/**
	 * Check the value of the total value after  adding 1 and
	 * then dividing by 0
	 */
	public void testDivideTwo() {
		Calculator obj = new Calculator();
		obj.add(1);
		obj.divide(0);
		assertEquals(obj.getTotal(),0);
	}

	@Test
	/**
	 * Check the string history after initialization of object
	 */
	public void testGetHistoryOne() {
		Calculator obj = new Calculator();
		assertEquals(obj.getHistory(),"0");
	}
	
	/**
	 * Check the string history after adding 10
	 */
	public void testGetHistoryTwo() {
		Calculator obj = new Calculator();
		obj.add(10);
		assertEquals(obj.getHistory(),"0 + 10");
	}
}
