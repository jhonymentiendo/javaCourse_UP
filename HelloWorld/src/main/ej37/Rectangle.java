package main.ej37;

public class Rectangle {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width<0 ? 0 : width;
		this.length = length<0 ? 0 : length;
	}
	
}
