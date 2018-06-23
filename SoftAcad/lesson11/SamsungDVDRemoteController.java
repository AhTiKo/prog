package lesson11;

public class SamsungDVDRemoteController implements IDVDRemoteController, ITVRemoteController {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("Samsung DVD eject");
	}

	@Override
	public void insertDisk() {
		// TODO Auto-generated method stub
		System.out.println("Samsung DVD inserted disk!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Samsung DVD stop!");
	}

	@Override
	public void startTv() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV start");
	}

	@Override
	public void stopTv() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV stop");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV channel up");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV channel down");
	}

	@Override
	public void GoTochannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV go to channel " + channel);
	}

}
