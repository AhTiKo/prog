package streamsAndFiles;

import java.awt.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

public class Problem5 {

	public static void main(String[] args) throws ClassNotFoundException {
		try(ObjectOutputStream writer = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("doubles.list")))){
				ArrayList<Double> doubleList = new ArrayList<>();
				doubleList.add(3.14);
				doubleList.add(45.45);
				doubleList.add(2.45);
				doubleList.add(3.2);
				doubleList.add(31.3);
				doubleList.add(7.3);
				doubleList.add(23.667);
				writer.writeObject(doubleList);
				
				
				//System.out.println("list: " + reader.readObject());
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

}

	