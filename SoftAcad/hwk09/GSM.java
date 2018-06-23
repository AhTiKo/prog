package hwk09;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	public GSM(String model) {
		setModel(model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		} else {
			System.out.println("Model is not valid!");
		}
	}

	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		if (isHasSimCard() && simMobileNumber != null && simMobileNumber.length() == 10
				&& simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8') {
			this.simMobileNumber = simMobileNumber;
			System.out.println("Inserted sim card with number " + this.getSimMobileNumber() + " into " + this.getModel());
		} else if (!isHasSimCard() || simMobileNumber == null) {
			this.simMobileNumber = null;
			System.out.println("Number is not valid!");
		}

	}

	public double getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public void setOutgoingCallsDuration(double outgoingCallsDuration) {
		if (outgoingCallsDuration >= 0) {
			this.outgoingCallsDuration = outgoingCallsDuration;
		}
	}

	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	public void setLastIncomingCall(Call lastIncomingCall) {
		this.lastIncomingCall = lastIncomingCall;
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	public void setLastOutgoingCall(Call lastOutgoingCall) {
		this.lastOutgoingCall = lastOutgoingCall;
	}

	public void insertSimCard(String simMobileNumber) {
		setHasSimCard(true);
		setSimMobileNumber(simMobileNumber);
	}

	public void removeSimCard() {
		setHasSimCard(false);
		System.out.println("Removed sim card of " + this.getModel());

	}

	public void call(GSM receiver, double duration) {
		Call call = new Call(this, receiver, duration);
		if(call.getCaller() != null && call.getReceiver() != null && call.getCaller().getSimMobileNumber() != call.getReceiver().getSimMobileNumber()){
			this.setLastOutgoingCall(call);
			receiver.setLastIncomingCall(call);
			this.setOutgoingCallsDuration(getOutgoingCallsDuration() + duration);
			System.out.println(call.getCaller().simMobileNumber + " phone " + call.getReceiver().getSimMobileNumber() + " with duration " + call.getDuration());
		} else {
			System.out.println("Call is not valid!");
		}
	}

	public double getSumForCall() {
		return this.getOutgoingCallsDuration() * Call.PRICE_FOR_MINUTE;
	}

	public void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println(this.getLastOutgoingCall().getReceiver().getModel() + " last outgoing call: "
					+ this.getLastOutgoingCall().getDuration());
		}
	}

	public void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println(this.getLastIncomingCall().getCaller().getModel() + " last incoming call: "
					+ this.getLastIncomingCall().getDuration());
		}

	}

}
