


public class Circle {

	private int x,y;
	private double radius;
	private String shape_Circle = "O";
	
	public Circle() {}
	
	public Circle(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	public Circle(int newX, int newY, double newRadius) {
		x = newX;
		y = newY;
		radius = newRadius;
	}

	
	public void draw() {
		System.out.println(shape_Circle);
	}
	
	public int getX() {return x;}

	public int getY() {return y;}

	public double getRadius() {return radius;}
	
	public double getArea() {return (radius*radius) * 3.14;}

	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	public void setRadius(double radius) {this.radius = radius;}

	
	public boolean isEqual(Circle sq_Object) {
		
		if(this.getArea() == sq_Object.getArea() && this.radius == sq_Object.radius) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "O";
	}
}