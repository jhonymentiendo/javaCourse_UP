package main.sec7;

public class Dog extends Animal{

	private String earShape;
	private String tailShape;

	public Dog() {
        super("Mutt", "Big", 50);
    }
	
	public Dog(String earShape, String tailShape) {
		
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	
	public Dog(String type, double weight , String earShape, String tailShape) {
		super(type, weight < 15 ? "small" : ( weight < 35 ? "Medium" : "large" ), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
