package application.HW2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Oval {

	private double p;
	private double a;
	
	public Circle(double x, double y, double r, Color color) {
		super(x, y, r, r, color);
		computeP();
		computeA();
	}

	private void computeP()
	{
		this.p = (2 * Math.PI * this.getRadius());
	}
	
	private void computeA()
	{
		this.a = (Math.PI * Math.pow(this.getRadius(), 2));
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
	}

	@Override
	public String toString() {
		return  "Circle : { " +
				"Radius = " + this.getRadius() +
				" , Perimeter = " + this.p +
				" , Area = " + this.a +
				" }";
	}
	
	public double getRadius()
	{
		return this.getRadiusX();
	}
	
}
