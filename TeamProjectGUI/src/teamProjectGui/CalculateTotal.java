/**
 * 
 */
package teamProjectGui;

/**
 * @author Brady H.
 *
 */
public class CalculateTotal {
	
	static double priceTotal = 0.00;
	static double tax = 0.0725;
	static double totalWithTax = (priceTotal * 1) * tax;
	
	public static double calculate(double d) {
		
		//System.out.println(totalWithTax);
		
		return totalWithTax += d;
		
	}

}
