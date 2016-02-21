
package cse360assign3;
/**Calculator class with simple calculator Operation 
 * 
 * @author Arsh Padda
 * @version Feb 17, 2016
 */
public class Calculator {
	private int total;
	String history = "0";
	/**
	 * Calculator class constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * Return value of total variable 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Add the value in the parameter to the total variable
	 * Record the history
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	/**
	 * Subtract the value in the parameter from the total variable
	 * Record the history
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	/**
	 * Mutiply the value in the parameter to the total variable
	 * Record the history
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	/**
	 * Divide the value in the parameter from the total. If the value of the 
	 * value variable us zero, then set the total variable to zero
	 * Record the history
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0){
			total = 0;
			history = history + " / " + value;
		}
		else{
			total = total / value;
			history = history + " / " + value;
		}
	}
	/**
	 * Return the history of add, subtract, multiplication and
	 * division in the form of a String 
	 * @return the history of operation
	 */
	public String getHistory () {
		return history;
	}
}