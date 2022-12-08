package main.polimorphism;

public class HybridCar extends Car {

	private double avgKmPerLitre;
	private int baterySize;
	private int cylinders;
	public HybridCar(String description, double avgKmPerLitre, int baterySize, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.baterySize = baterySize;
		this.cylinders = cylinders;
	}
	
	
	
}
