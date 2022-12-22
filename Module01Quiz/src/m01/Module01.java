/**
 * 
 */
package m01;

/**
 * @author Brady H.
 *
 */
public class Module01 {
	
	/**
	 * 
	 * @param word
	 * @return reversed word
	 */
	public static String transform(String word) {
		String newStr = "";
		char character;
		for(int i = 0; i<word.length(); i++) {
			character = word.charAt(i);
			newStr = character+newStr;
		}
		return newStr;
	}
	
	/**
	 * 
	 * @param str
	 * @return lower case string with leading a's capitalized
	 * and trailing z's also capitalized.
	 * Also calls the transform method and adds it to the end of the string.
	 */
	public static String methodA(String str) {
		String result = str.toLowerCase();
		for(int i = 0; i<result.length(); i++) {
			if(result.charAt(i) == '_') {
				result = result.replace("_", "");
			}
		}
		if(result.charAt(0) == 'a') {
			result = result.replace(result.charAt(0), 'A');
		}
		if(result.charAt(result.length()-1) == 'z') {
			result = result.replace(result.charAt(result.length()-1), 'Z');
		}
		return result + transform(result);
	}
	
	/**
	 * 
	 * @param letters
	 * @return count of letters with occurences of key pairs subtracted.
	 */
	public static int methodB(String letters) {
		int count = 0;
		String result = letters.toLowerCase();
		for(int i = 0; i<result.length(); i++) {
			count++;
			if(result.charAt(i) == 'a' && result.charAt(i+1) == 'e') {
				count--;
			}
			if(result.charAt(i) == 'o' && result.charAt(i+1) == 'e') {
				count--;
			}
			if(result.charAt(i) == 'u' && result.charAt(i+1) == 'e') {
				count--;
			}
			if(result.charAt(i) == 'e' && result.charAt(i+1) == 'u') {
				count--;
			}
		}
		return count;
	}
}
