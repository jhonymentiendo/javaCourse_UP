package main;

public class Wall {
    
    private double width;
    private double height;
    
    public Wall(){
    	this(0,0);
    }
    public Wall(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getArea() {
    	return getWidth()*getHeight();
    }
    
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width<0 ? 0 : width;
	}

	public void setHeight(double height) {
		this.height = height<0 ? 0 : height;
	}
    
}
