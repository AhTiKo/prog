package problem1;

public class Box {
	private double length;
	private double width;
	private double heigth;
	
	public Box(double length, double width, double heigth){
		if (length > 0 & width > 0 & heigth > 0){
			this.length = length;
			this.width  = width;
			this.heigth = heigth;	
		}else{
			System.out.println("Error!!!");
		}
	}
	
	public double getLength(){
		return this.length;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeigth(){
		return this.heigth;
	}
	
	public void setHeigth(double heigth){
		this.heigth = heigth;
	}
	
	public double surfaceArea(){
		return 2*this.heigth*this.length + 2*this.heigth*this.width + 2*this.length*this.width;
	}
	
	public double literalSurfaceArea(){
		return 2*this.length*this.heigth + 2*this.width*this.heigth;
	}
	
	public double volume(){
		double volume= this.length*this.heigth*this.width;
		return volume;
	}

}
