package streamsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		final String FILE_PATH = "users.txt";
		final String SAVE_PATH = "total-time1.txt";
		File file = new File (FILE_PATH);
		File outputFile = new File(SAVE_PATH);
		try{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter( outputFile , true );
		PrintWriter writer = new PrintWriter( fw , true );
		String line = reader.readLine();
		
		while (line != null){
			String[] elements = line.split(" ");
			String userName = elements[0];
			int totalMin =0;
			
			for (int i = 1; i < elements.length; i++) {
				String[] logTime = elements[i].split(":");
				int hours = Integer.parseInt(logTime[0]);
				int mins = Integer.parseInt(logTime[1]);
				totalMin += ( hours * 60 ) + mins;
			}
			
			line = reader.readLine();
			
			String minStr = String.valueOf(totalMin%60);
			String hourStr = String.valueOf((totalMin/60)%60);
			String dayStr = String.valueOf(totalMin/60/60);
			String output = userName + " " + totalMin + "(" + dayStr + "days," + hourStr + "hours," + minStr + "minutes)";
			
			writer.println(output);
		}
		reader.close();
		writer.close();
		}catch(IOException ioe){
			System.out.println("Error!");
		}
	}

}
