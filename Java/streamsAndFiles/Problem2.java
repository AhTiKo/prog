package streamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem2 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("lines.txt"));
			PrintWriter writer = new PrintWriter(new FileWriter("lines2.txt",true),true);
			
			String line = reader.readLine();
			
			while (line != null){
				
				writer.println(line.toUpperCase());
				line = reader.readLine();
			}
			reader.close();
			writer.close();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
			

	}

}
