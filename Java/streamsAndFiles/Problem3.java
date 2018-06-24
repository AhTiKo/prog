package streamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem3 {


	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
			PrintWriter writer = new PrintWriter(new FileWriter("count-chars.txt",true),true);
			
			
			String text = reader.readLine();
			int vowels = 0;
			int consonants = 0;
			int punctuation = 0;
			for (int i = 0; i < text.length(); i++) {
				char elm = text.charAt(i);
				if ((elm == 'a')||(elm == 'A')||(elm == 'e')||(elm == 'E')||(elm == 'i')||
						(elm == 'I')||(elm == 'o')||(elm == 'u')||(elm == 'U')){
					 vowels += 1;
				}else{
					if ((elm == '!')||(elm == ',')||(elm == '.')||(elm == '?')){
						punctuation += 1;
					}else{
						if (elm == ' '){
						}else{
							 consonants +=1;
						}
					}
				}
			}
			
			writer.println("Vowels: " + vowels);
			writer.println("Consonants: " + consonants);
			writer.println("Punctuation: " + punctuation);
			
			reader.close();
			writer.close();
			
			
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

}
