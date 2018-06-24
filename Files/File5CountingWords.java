import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class File5CountingWords {

	
	public static void main(String[] args) {
		String fileWords = "words.txt";
		String fileText = "text.txt";
		String fileOutput = "rezult.txt";
		Scanner fileReader = null;
		PrintStream fileWriter = null;
		try{
			fileReader = new Scanner(new File(fileWords));
			String lineWord = "";
			
			while(fileReader.hasNextLine()){
				lineWord += fileReader.nextLine() + " ";
			}
			
			String[] lineWords = lineWord.split("[ ]+");
			Map<String,Integer> countingWords = new HashMap<String,Integer>(lineWords.length);
			
			for(int i = 0; i < lineWords.length; i ++){
				countingWords.put(lineWords[i],0);
			}
			
			fileReader = new Scanner(new File(fileText));
			String lineText = "";
			
			while(fileReader.hasNextLine()){
				lineText = fileReader.nextLine();
				String[] lineWordsText= lineText.split("[ ,.]+");
				for(int i = 0; i < lineWordsText.length; i ++){
					if (countingWords.containsKey(lineWordsText[i])){
						countingWords.put(lineWordsText[i],countingWords.get(lineWordsText[i])+1);
					}
				}
			}
			
			fileWriter = new PrintStream(new File(fileOutput));
			for(Map.Entry<String, Integer>entry: countingWords.entrySet()){
				fileWriter.println(entry.getKey()+" "+entry.getValue());
			}
			
			}catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
			} finally {
			if (null != fileReader) {
				fileReader.close();
			}
			if (null != fileWriter) {
				fileWriter.close();
			}
		
		}

	}

}
