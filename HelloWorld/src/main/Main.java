package main;



public class Main {
	
	public static void main(String[] args){
		
		House blueHouse = new House("Blue");
		House anotherHouse = blueHouse;
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		
		anotherHouse.setColor("yelloy");
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		House greeHouse = new House("green");
		
		anotherHouse = greeHouse;
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		System.out.println(greeHouse.getColor());
		
	}
	
}
