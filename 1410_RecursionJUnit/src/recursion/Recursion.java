/**
 * 
 */
package recursion;

/**
 * @author Brady H.
 *
 */

import java.lang.Math;

public class Recursion {
	
	public static int countSmiles(char[] letters, int index) {
		int total = 0;
		if(letters.length > 1)
		{
			if(letters[index] == ':' && letters[index + 1] == ')')
			{ total++; }
		
			if(index == letters.length - 2) 
			{ return total; }
			else
			{ total += countSmiles(letters,index + 1); }
		}
		return total;
	}
	
	public static int sumOfDigits(int n) {
		
		if(n<0) {
			if(n>-10) {
				return Math.abs(n);
			}
			else {
				int negNum = Math.abs(n) % 10;
				return sumOfDigits(n/10) + negNum;
			}
		}
		if(n<10) {
			return n;
		}
		else {
			int num = n%10;
			return sumOfDigits(n/10) + num;
		}
	}
	
	public static String toUpper(String str) {
		if(str.length()==1) {
			return str.toUpperCase();
		}
		else {
			String output = "";
			for(int i = 0; i < str.length(); i++) {
				output += toUpper(String.valueOf(str.charAt(i)));
				if(i != str.length()-1) {
					output += " ";
				}
			}
			return output;
		}
	}
	
	public static double harmonic(int n) {
		if(n==0) {
			throw new IllegalArgumentException("The argument n cannot be zero.");
		}
		if(n==1) {
			return 1;
		}
		else if(n<0) {
			return -1 * harmonic(-n);
		}
		else { // n is greater than 1
			return 1.0 / n + harmonic(n-1);
		}
	}
}
