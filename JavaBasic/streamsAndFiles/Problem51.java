package streamsAndFiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Problem51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (ObjectInputStream reader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("doubles.list")))){
		
		
		ArrayList<Double> newList = (ArrayList<Double>) reader.readObject();
		
		for (Double double1 : newList) {
		
		System.out.println(double1);
		}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
