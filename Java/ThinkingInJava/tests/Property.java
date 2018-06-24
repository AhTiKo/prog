package tests;
import java.util.*;
public class Property {

	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usege:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total memory = "
					+ rt.totalMemory()
					+ " Free memory = "
					+ rt.freeMemory());	

	}

}
