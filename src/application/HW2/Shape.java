package application.HW2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape implements ShapePositionInterface {

	/** member variables */
	private double x, y;
	private Color color;
	
	protected Shape(double x, double y, Color color)
	{
		setX(x);
		setY(y);
		setColor(color);
	}
	
	/** Abstract Classes that must be overriden */
	public void draw(GraphicsContext gc)
	{
		gc.setFill(this.getColor());
	}
	
	@Override
	public double distanceTo(double x, double y) {
		return Math.sqrt(Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2));
	}
	
	public abstract Rectangle getBoundingBox();
	
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
	
	@Override
	public void moveTo(double dx, double dy) {
		setX(this.getX() + dx);
		setY(this.getY() + dy);
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
	
	@Override
	public double[] getPoint() {
		double point[] = new double[2];
		point[0] = this.getX();
		point[1] = this.getY();
		return point;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
}