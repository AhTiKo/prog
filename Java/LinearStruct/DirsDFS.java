import java.io.File;
import java.util.Stack;


public class DirsDFS {

	public static void traverseDir(String startDirectory){
		Stack<File> visitedDirs = new Stack<File>();
		visitedDirs.push(new File(startDirectory));
		while (visitedDirs.size() > 0){
			File currentDir = visitedDirs.pop();
			System.out.println(currentDir.getAbsolutePath());
			File[] children = currentDir.listFiles();
			if (children != null) {
				for (File child : children) {
					if (child.isDirectory()) {
						visitedDirs.push(child);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		traverseDir("/home/tiko/workspace");

	}

}
