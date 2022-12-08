package main.polimorphism;

public class Car {
	
	private String description;
	
	private boolean engine;

    private int cylinders;

    private String name;

    private int wheels;

    public Car(String description) {
        this.description = description;
    }
    
    
    public Car(String description, int cylinders, String name) {
		this.description = description;
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}
	
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
	
    public int getCylinders() {
        return cylinders;
    }
    
    public String getName() {
        return name;
    }
	

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    
    
    
}
