package application.HW1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Polygon extends Shape {

	private int N;
	private double[] x;
	private double[] y;
	
	private double s;
	private double angle;
	private double p;
	private double a;
	
	public Polygon(int N, double centerX, double centerY, Color color) {
		super(centerX, centerY, color);	
		this.N = N;
		
		this.x = new double[N];
		this.y = new double[N];
		
		for(int i = 0; i < this.N; i++)
			this.x[i] = this.getX() + 200 * Math.cos((i * 2 * Math.PI) / this.N);
		for(int i = 0; i < this.N; i++)
			this.y[i] = this.getY() + 200 * Math.sin(i * 2 * Math.PI / this.N);
		
		computeS();
		computeAngle();
		computeP();
		computeA();
	}

	private void computeA() {
		double apothem = s / (2 * Math.tan(180 / this.N));
		this.a = (this.p * apothem) / 2;
	}

	private void computeP() {
		this.p = this.s * this.N;
	}

	private void computeAngle() {
		this.angle = ((this.N - 2) * 180) / this.N;
	}

	private void computeS() {
		this.s = Math.sqrt(x[0]* x[0] + y[0] * y[0]);
	}

	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
		gc.fillPolygon(this.x, this.y, this.N);
	}

	@Override
	public String toString() {
		return  "Polygon : { " +
				"Side Length = " + this.s + ", " +
				"Interior Angle = " + this.angle + ", " +
				"Perimeter = " + this.p + ", " +
				"Area = " + this.a +
				" }";
	}
	
}
