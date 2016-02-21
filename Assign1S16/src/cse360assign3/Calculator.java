
package cse360assign3;
/**Calculator class with no implementation 
 * 
 * @author Arsh Padda
 * @version Feb 17, 2016
 */
public class Calculator {
	private int total;
	/**
	 * Calculator class constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * Return value of total variable 
	 * @return 0
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Add the value in the parameter to the total variable
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * Subtract the value in the parameter from the total variable
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	/**
	 * Mutiply the value in the parameter to the total variable
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	/**
	 * Divide the value in the parameter from the total. If the value of the 
	 * value variable us zero, then set the total variable to zero
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	/**
	 * No implementation getHistory method
	 * @return Empty String
	 */
	public String getHistory () {
		return "";
	}
}