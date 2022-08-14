package arraylist;
/**
 * This class creates a Square object with sides
 * @author Jake Holovka
 *
 */

public class Square {

	private double side;
	
	/**
	 * 	Empty-argument constructor
	 */
	public Square() {
		
		side = 0;
		
	}//end empty- argument constructor

	/**
	 * Preferred constructor
	 * @param s
	 */
	public Square(double s) {
		
		side = s;
	}//end preferred constructor
	
	/**
	 * Calculates the area of a square
	 * @return area
	 */
	public double getArea() {
		
		double area = 0;
		
		area = side * side;
		
		return area;
	}//end getArea
	
	/**
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + ", getArea()=" + getArea() + "]";
	}//end toString
	
	
}//end class
