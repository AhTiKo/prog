package streamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem1 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("lines.txt"));
			String line = reader.readLine();
			
			while (line != null){
				int sum = 0;
				for (int i = 0; i < line.length(); i++) {
					sum += line.charAt(i);
				}
				System.out.println(sum);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

}
