package application.HW2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Oval extends Shape {

	private double radiusX, radiusY;
	
	public Oval(double centerX, double centerY, double radiusX, double radiusY, Color color) {
		super(centerX, centerY, color);
		this.radiusX = radiusX;
		this.radiusY = radiusY;
	}

	@Override
	public void draw(GraphicsContext gc)
	{
		super.draw(gc);
		gc.fillOval(this.getX(), this.getY(), this.radiusX, this.radiusY);
	}
	
	@Override
	public String toString() {
		return "Oval: { " + 
			   "Center: ( " + this.getX() + ", " + this.getY() + " ) " +
			   "Radius: ( " + this.radiusX + ", " + this.radiusY + " ) }";
	}

	public double getRadiusX() {
		return this.radiusX;
	}
	
	public double getRadiusY() {
		return this.radiusY;
	}

	@Override
	public Rectangle getBoundingBox() {
		return new Rectangle(getX(), getY(), getRadiusX(), getRadiusY(), Color.BLACK);
	}
	
}
