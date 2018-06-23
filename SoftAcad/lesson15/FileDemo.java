package lesson15;

import java.io.File;
import java.io.IOException;

import javax.swing.SingleSelectionModel;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		File file1 = new File("C://Users//Iskren//SoftAcad//MyFirstJavaProject//test.txt");
//		File file2 = new File("test.txt");
//		File file3 = new File("./tmp/test2.txt");   // tmp/test2.txt
//		
//		if(file1.exists()){
//			System.out.println("Yes it exists");
//		} else {
//			System.out.println("No");
//		}
//		
//		if(file2.exists()){
//			System.out.println("Yes,file2 exists");
//		} else {
//			System.out.println("No");
//		}
//		
//		if(file3.exists()){
//			System.out.println("Yes,file3 exists");
//		} else {
//			System.out.println("No");
//		}
//		
//		if(file1.isFile()){
//			System.out.println("file1 is file");
//		} else {
//			System.out.println("No");
//		}
//		
//		
		
		File file1 = new File("F://javaTest//iotest");
		
		if(file1.exists()){
			System.out.println("Yes, iotest  exists");
		} else {
			file1.mkdir();
		}
		
		File file2 = new File(file1,"test.txt");
		if(file2.exists()){
			System.out.println("Yes, test.txt  exists");
		} else {
			file2.createNewFile();
		}
		
		File file3 = new File(file1,"2test.txt");
		File file4 = new File(file1,"test3.txt");
		
		file3.createNewFile();
		file4.createNewFile();
		
		File files[] = file1.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		for (File file : files) {
			if (file.getName().toLowerCase().startsWith("t")) {
				file.delete();
				
			}
		}
		
		File files1[] = file1.listFiles();
		for (File file : files1) {
			System.out.println(file.getName());
		}
	}

}
