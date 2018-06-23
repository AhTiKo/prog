package lesson18;

import java.util.ArrayList;

public class Cage <T extends Animal> {
	private ArrayList<T> list;
	
	public Cage(){
		this.list = new ArrayList<T>();
	}
	
	public void add(T animal){
		this.list.add(animal);
	}
	
	 
	public <T> boolean isContained(T t){
		return list.contains(t);
	}
}
