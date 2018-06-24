package streamsAndFiles;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// Create a PrintStream instance
		PrintStream fileWriter = new PrintStream("numbers.txt");
		// Loop through the numbers from 1 to 20 and write them
		for (int num = 1; num <= 20; num++) {
		fileWriter.println(num);
		}
		// Close the stream when you are done using it
		fileWriter.close();

	}

}
