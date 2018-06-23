package hwk09;

public class GsmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM nokia = new GSM("nokia");
		nokia.insertSimCard("0898123456");
		GSM samsung = new GSM("samsung");
		samsung.insertSimCard("0888123456");
		GSM sony = new GSM("sony");
		sony.insertSimCard("0878123456");
		nokia.call(samsung, 23);
		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastIncomingCall();
		nokia.call(sony, 0.3);
		samsung.call(nokia, 5.4);
		sony.call(samsung, 34.2);
		sony.removeSimCard();
		nokia.call(sony, 3);
		nokia.call(nokia, 2);
		System.out.println("Nokia's cost with number " + nokia.getSimMobileNumber() +" is " + nokia.getSumForCall());
		
		
	}

}
