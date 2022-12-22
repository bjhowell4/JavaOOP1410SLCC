/**
 * 
 */
package m05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Brady H.
 *
 */
public class Module05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] Xs = new String[8];
		
		

		/**
		 * Buffered reader and writer
		 */
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("src/m05/Pattern.txt"));
			writer.write("      X");
			writer.write("\n" + "    X X");
			writer.write("\n" + "  X X X");
			writer.write("\n" + "X X X X");
			
			writer.write("\n");
			
			writer.write("\n" + "* * * * *");
			writer.write("\n" + "  * * * * *");
			writer.write("\n" + "    * * * * *");
			
			writer.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/m05/Pattern.txt"));
			String line = "0";
			
			for (int i = 0; i < Xs.length && line != null; i++) {
				line = reader.readLine();
				System.out.println(line);
				Xs[i]=line;
			}
			
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		try {
			BufferedWriter writer2 = new BufferedWriter(new FileWriter("src/m05/Pattern2.txt"));
			writer2.write("      XX");
			writer2.write("\n" + "    X XX X");
			writer2.write("\n" + "  X X XX X X");
			writer2.write("\n" + "X X X XX X X X");
			
			writer2.write("\n");
			
			writer2.write("\n" + "* * * * *        * * * * *");
			writer2.write("\n" + "  * * * * *    * * * * *");
			writer2.write("\n" + "    * * * * ** * * * *");
			
			writer2.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		try {
			BufferedReader reader2 = new BufferedReader(new FileReader("src/m05/Pattern2.txt"));
			String line = "0";
			
			for (int i = 0; i < Xs.length && line != null; i++) {
				line = reader2.readLine();
				System.out.println(line);
				Xs[i]=line;
			}
			
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		try {
			BufferedWriter writer3 = new BufferedWriter(new FileWriter("src/m05/Pattern3.txt"));
			writer3.write("      X");
			writer3.write("\n" + "    X X");
			writer3.write("\n" + "  X X X");
			writer3.write("\n" + "X X X X");
			writer3.write("\n" + "X X X X");
			writer3.write("\n" + "  X X X");
			writer3.write("\n" + "    X X");
			writer3.write("\n" + "      X");
			
			writer3.write("\n");
			
			writer3.write("\n" + "* * * * *");
			writer3.write("\n" + "  * * * * *");
			writer3.write("\n" + "    * * * * *");
			
			writer3.write("\n" + "    * * * * *");
			writer3.write("\n" + "  * * * * *");
			writer3.write("\n" + "* * * * *");
			
			writer3.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		try {
			BufferedReader reader3 = new BufferedReader(new FileReader("src/m05/Pattern3.txt"));
			String line = "0";
			
			for (int i = 0; i < Xs.length && line != null; i++) {
				line = reader3.readLine();
				System.out.println(line);
				Xs[i]=line;
			}
			
		} catch (IOException e3) {
			e3.printStackTrace();
		}

	}

}
