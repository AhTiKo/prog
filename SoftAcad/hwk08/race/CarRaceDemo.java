package hwk08.race;

import javax.swing.plaf.SliderUI;

public class CarRaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRace monaco = new CarRace("Monaco");
		CarRace monza = new CarRace("Monza");
		
		monaco.addCar("Trabant", 1964);
		monaco.addCar("ZAZ", 1968);
		monaco.addCar("Ziguli", 1969);
		monaco.addCar("Fiat", 1967);
		monaco.addCar("Ford", 1971);
		monaco.addCar("Opel", 1964);
		monaco.addCar("BMW", 1961);
		monaco.addCar("Mini", 1968);
		monaco.addCar("Porshe", 1960);
		monaco.startRace(4);
		
		monza.addCar("Mercedes", 2017);
		monza.addCar("Ferrari", 2017);
		monza.addCar("Red Bull Racing", 2017);
		monza.addCar("Force India", 2017);
		monza.addCar("Williams", 2017);
		monza.addCar("Toro Rosso", 2017);
		monza.addCar("Haas", 2017);
		monza.addCar("Renault", 2017);
		monza.addCar("Sauber", 2017);
		monza.addCar("McLaren", 2017);
		monza.startRace(53);
		CarRace.printInfo();
		
		CarRace silverStone = new CarRace("SilverStone");
		silverStone.addCar("Mercedes", 2017);
		silverStone.addCar("Ferrari", 2017);
		silverStone.addCar("Red Bull Racing", 2017);
		silverStone.addCar("Force India", 2017);
		silverStone.addCar("Williams", 2017);
		silverStone.addCar("Toro Rosso", 2017);
		silverStone.addCar("Haas", 2017);
		silverStone.addCar("Renault", 2017);
		silverStone.addCar("Sauber", 2017);
		silverStone.addCar("McLaren", 2017);
		silverStone.addCar("Trabant", 1964);
		silverStone.addCar("ZAZ", 1968);
		silverStone.addCar("Ziguli", 1969);
		silverStone.addCar("Fiat", 1967);
		silverStone.addCar("Ford", 1971);
		silverStone.addCar("Opel", 1964);
		silverStone.addCar("BMW", 1961);
		silverStone.addCar("Mini", 1968);
		silverStone.addCar("", 1576);
		silverStone.addCar("Porshe", 1960);
		silverStone.addCar("Moskich", 1972);
		silverStone.addCar("Warburg", 1975);
		silverStone.addCar("Renault", 1969);
		silverStone.startRace(12);
		silverStone.removeCars();
		silverStone.addCar("Red Bull Racing", 2017);
		silverStone.addCar("Force India", 2017);
		silverStone.addCar("Williams", 2017);
		silverStone.addCar("Toro Rosso", 2017);
		silverStone.addCar("Haas", 2017);
		silverStone.addCar("Renault", 2017);
		silverStone.addCar("Sauber", 2017);
		silverStone.addCar("McLaren", 2017);
		silverStone.addCar("Trabant", 1964);
		silverStone.addCar("ZAZ", 1968);
		silverStone.addCar("Ziguli", 1969);
		silverStone.addCar("Fiat", 1967);
		silverStone.addCar("Ford", 1971);
		silverStone.addCar("Opel", 1964);
		silverStone.addCar("BMW", 1961);
		silverStone.addCar("Mini", 1968);
		silverStone.startRace(10);
	}

}
