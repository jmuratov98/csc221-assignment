package application.HW2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {

	private double width, height;
	
	public Rectangle(double x, double y, double width, double height, Color color) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}
	
	public void draw(GraphicsContext gc)
	{
		super.draw(gc);
		gc.fillRect(this.getX(), this.getY(), this.width, this.height);
	}

	public double getWidth()
	{
		return this.width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	@Override
	public String toString() {
		return "Rectangle: { " +
			   "Width = " + this.width + ", " +
			   "Height = " + this.height + " }";
	}

	@Override
	public Rectangle getBoundingBox() {
		return null;
	}

	

	
	
}
