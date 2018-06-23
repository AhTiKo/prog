package lesson15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("ET.jpg");
//		File file2 = new File("ET2.jpg");
		File file2 = new File("ET3.jpg");
		
		FileInputStream fis1 = new FileInputStream(file1);
		FileInputStream fis2 = new FileInputStream(file2);
		boolean isEquals = true;
		
		
		int b1 = 0;
		int b2 = 0;
		while((b1 != -1) && (b2 != -1)) {
			b1 = fis1.read();
			b2 = fis2.read();
			if(b1 != b2) {
				isEquals = false;
				break;
			}
		}
		
		if(isEquals){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		fis1.close();
		fis2.close();
		
		
	}

}
