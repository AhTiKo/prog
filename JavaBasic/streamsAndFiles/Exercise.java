package streamsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Wrapper;

public class Exercise {

	public static void main(String[] args){
		try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))){
			PrintWriter writer = new PrintWriter(new FileWriter("totalTime.txt"),true);
			String line;
			while (reader.readLine() != null){
				line = reader.readLine();
				String[] elements = line.split(" ");
				String userName = elements[0];
				int totalMinutes = 0;
				for (int i = 1; i < elements.length; i++) {
					String[] logTime = elements[i].split(":");
					int hours = Integer.parseInt(logTime[0]);
					int minutes = Integer.parseInt(logTime[1]);
					totalMinutes += hours*60 + minutes;
				}
				String output = userName + " " + totalMinutes;
				writer.println(output);
				
			}
			reader.close();
			writer.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found!");
		}catch (IOException ioe){
			System.out.println(ioe);
		}
		

	}

}
