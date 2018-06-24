package streamsAndFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem4 {

	public static void main(String[] args) {
		try (FileInputStream reader = new FileInputStream("pic.jpg");
				FileOutputStream writer = new FileOutputStream("picCopy.jpg")){
			
			byte[] buffer = new byte[1024];
			
			int bytesRead = reader.read(buffer);
			while(bytesRead != -1){
				writer.write(buffer,0,bytesRead);
				bytesRead = reader.read(buffer);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("IO Error!");
		}
	}

}
