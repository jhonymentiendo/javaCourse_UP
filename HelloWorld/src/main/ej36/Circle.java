package main.ej36;

public class Circle {
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius<0?0:radius;
    }
    
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public double getRadius(){
        return radius;
    }
    
    
}
