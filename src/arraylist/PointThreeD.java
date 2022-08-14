package arraylist;
/**
 * This class creates an Object with X,Y,Z coordinates
 * @author Jake Holovka
 *
 */
public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	/**
	 * Empty-argument constructor
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor
	 * @param x
	 * @param y
	 * @param z
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor

	/**
	 * @return toString
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
	
}//end class
