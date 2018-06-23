package lesson11;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungDVDRemoteController samsung = new SamsungDVDRemoteController();
		SonyDVDRemoteController sony = new SonyDVDRemoteController();
		
		samsung.insertDisk();
		samsung.channelDown();
		sony.play();
	}

}
