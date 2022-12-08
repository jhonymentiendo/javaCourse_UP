package main;

public class Point {

	private int x = 0;
	private int y = 0;

	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public double distance() {
		double resp = distance(0,0);
		return resp;
	}

	public double distance(Point another) {
		return distance(another.getX(), another.getY());
	}

	public double distance(int x, int y) {
		int resx = getX() > x ? getX() - x : x - getX();
		int resy = getY() > y ? getY() - y : y - getY();
		double resp = squareRoot( (resx*resx) + (resy*resy) );
		return resp;
	}

	public static double squareRoot(int num) {
		double t;
		double sqrtroot = num/2;
		if(sqrtroot>0) {
		do {
			t = sqrtroot;
			
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		}
		return sqrtroot;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
