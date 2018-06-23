package lesson11;

public interface ITVRemoteController {
	
	public static final int TV_CHANNEL = 100;
	
	public void startTv();
	public void stopTv();
	public void channelUp();
	public void channelDown();
	public void GoTochannel(int channel);

}
