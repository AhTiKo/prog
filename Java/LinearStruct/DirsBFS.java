import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


public class DirsBFS {

	public static void traverseDir(String startDirectory) {
		Queue<File> visitedDirsQueue = new LinkedList<File>();
		visitedDirsQueue.offer(new File(startDirectory));
		while (visitedDirsQueue.size() > 0) {
			File currentDir = visitedDirsQueue.poll();
			System.out.println(currentDir.getAbsolutePath());
			File[] children = currentDir.listFiles();
			if (children != null) {
				for (File child : children) {
					if (child.isDirectory()) {
						visitedDirsQueue.offer(child);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		traverseDir("/home/tiko/workspace");
	}

}
