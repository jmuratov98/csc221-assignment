package application.HW2;

public interface ShapePositionInterface extends PositionInterface {

	Rectangle getBoundingBox();
	
	static boolean doOverlap(Rectangle shape1, Rectangle shape2) {
		if(shape1.getX() > shape2.getX() + shape2.getWidth() || shape2.getX() > shape1.getX() + shape1.getWidth())
			return false;
		if(shape1.getY() < shape2.getY() + shape2.getHeight() || shape2.getY() < shape1.getY() + shape1.getHeight())
			return false;
		return true;
	}
	
	static boolean doOverlap(Rectangle shape1, Oval shape2) {
		if(shape1.getX() > shape2.getX() + shape2.getRadiusX() || shape2.getX() > shape1.getX() + shape1.getWidth())
			return false;
		if(shape1.getY() < shape2.getY() + shape2.getRadiusY() || shape2.getY() < shape1.getY() + shape1.getHeight())
			return false;
		return true;
	}
	
	static boolean doOverlap(Oval shape1, Oval shape2) {
		if(shape1.getX() > shape2.getX() + shape2.getRadiusX() || shape2.getX() > shape1.getX() + shape1.getRadiusX())
			return false;
		if(shape1.getY() < shape2.getY() + shape2.getRadiusY() || shape2.getY() < shape1.getY() + shape1.getRadiusY())
			return false;
		return true;
	}
	
}
