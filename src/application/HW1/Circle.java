package application.HW1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

	private double r; // radius of the circle
	private double p;
	private double a;
	
	public Circle(double x, double y, double r, Color color) {
		super(x, y, color);
		setRadius(r);
		computeP();
		computeA();
	}
	
	public Circle()
	{
		this(0, 0, 0, Color.BLACK);
	}
	
	public Circle(double radius)
	{
		this(0, 0, 0, Color.BLACK);
	}

	private void computeP()
	{
		this.p = (2 * Math.PI * r);
	}
	
	private void computeA()
	{
		this.a = (Math.PI * Math.pow(this.r, 2));
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		gc.fillOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
	}

	@Override
	public String toString() {
		return  "Circle : { " +
				"Radius = " + this.r +
				" , Perimeter = " + this.p +
				" , Area = " + this.a +
				" }";
	}

	public void setRadius(double r)
	{
		this.r = r;
	}
	
	public double getRadius()
	{
		return this.r;
	}
	
}
