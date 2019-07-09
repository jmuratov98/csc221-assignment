package application.HW2;

public interface PositionInterface {

	double[] getPoint();
	void moveTo(double dx, double dy);
	double distanceTo(double x, double y);
	
}
