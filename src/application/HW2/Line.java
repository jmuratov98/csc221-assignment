package application.HW2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {  
	
	private double len;
	private double angle;
	private double endX;
	private double endY;
	
	public Line(double startX, double startY, double endX, double endY, Color color) {
		super(startX, startY, color);
		this.endX = endX;
		this.endY = endY;
		computeLen(endX, endY);
		computeAngle(endX, endY);
	}
	
	private void computeLen(double x, double y)
	{
		double midX = this.getX() - x;
		double midY = this.getY() - y;
		this.len = (float) Math.sqrt(Math.pow(midX, 2) + Math.pow(midY, 2));
	}
	
	private void computeAngle(double x, double y)
	{
		double midX = x - this.getX();
		double midY = y - this.getY();
		this.angle = Math.atan2(midY, midX);
	}
	
	public double getLen()
	{
		return len;
	}
	
	public double getAngle() 
	{
		return angle;
	}

	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		gc.strokeLine(this.getX(),this.getY(), this.endX, this.endY);
	}

	@Override
	public String toString() {
		return  "Line : { " +
					"length = " + this.getLen() +
					", angle= " + this.getAngle() +
					" }";
	}

	@Override
	public Rectangle getBoundingBox() {
		return new Rectangle(this.getX(), this.getY(), getLen() * Math.cos(getAngle()), getLen() * Math.sin(getAngle()),Color.YELLOW);
	}

}
