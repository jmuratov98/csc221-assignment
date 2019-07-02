package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {

	/** member variables */
	private double x, y;
	private Color color;
	
	protected Shape(double x2, double y2, Color color)
	{
		setX(x2);
		setY(y2);
		setColor(color);
	}
	
	/** Abstract Classes that must be overriden */
	public void draw(GraphicsContext gc)
	{
		gc.setFill(this.getColor());
	}
	
	public abstract String toString(); // converts an object to a string
	
	/** Setters */
	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	/** Getters */
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	
}