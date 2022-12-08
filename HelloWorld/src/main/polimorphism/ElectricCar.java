package main.polimorphism;

public class ElectricCar extends Car {
	
	private double avgPerCarge;
	private int baterySize;
	
	public ElectricCar(String description, double avgPerCarge, int baterySize) {
		super(description);
		this.avgPerCarge = avgPerCarge;
		this.baterySize = baterySize;
	}

	
	
}
