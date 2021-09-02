/**
 * Password generator that takes advantage of the idea that 4 random
 * words would provide better security than a single word employing
 * 'l33t speak'.
 */
import java.io.*;
import java.util.Random;
public class PassGen {
	public static void main(String args[]) throws IOException {
		BufferedReader in = null;
		Random ran = new Random();
		String gen = "";
		try {
			String check = "";
			
			//Chooses 4 words from a list of 10000 words in file dict.txt
			for (int i = 0; i < 4; i++) {
				
				//Chooses one of 10000 words
				int rand = ran.nextInt(10000);
				in = new BufferedReader(new FileReader("dict.txt"));
				
				//searches for the word
				for (int j = 0; j < rand; j++) {
					check = in.readLine();
				}
				gen += check;
				gen += "_";
			}
		}
		finally {
			if (in != null) {
				in.close();
			}
		}
		System.out.println("gen: \"" + gen + "\", Length: " + gen.length());
		if (gen.length() < 25) {
			//Generally, a 25 characters is the minimum number of characters I accept as secure
			System.err.println("\tThe password generated may be too short");
		}
	}
}