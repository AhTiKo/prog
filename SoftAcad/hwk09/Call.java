package hwk09;

public class Call {
	public static final double PRICE_FOR_MINUTE = 0.10;
	private GSM caller;
	private GSM receiver;
	private double duration;
	
	
	public Call(GSM caller, GSM receiver, double duration){
		setCaller(caller);
		setReceiver(receiver);
		setDuration(duration);
	}
	
	
	public GSM getCaller() {
		return caller;
	}
	
	public void setCaller(GSM caller) {
		if (caller.isHasSimCard()) {
			this.caller = caller;
		} else {
			System.out.println("Caller is not valid!");
		}
		
	}
	
	public GSM getReceiver() {
		return receiver;
	}
	
	public void setReceiver(GSM receiver) {
		if (receiver.isHasSimCard()) {
			this.receiver = receiver;
		} else {
			System.out.println("Receiver is not valid!");
		}
		
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		if(duration > 0 && duration < 120){
			this.duration = duration;
		}else {
			System.out.println("Call duration is not valid!");
		}
	}
}
