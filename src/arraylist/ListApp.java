package arraylist;
/**
 * Tests all the Objects ArrayLists
 * @author Jake Holovka
 *
 */
public class ListApp {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Testing String ArrayList
		System.out.println("String ArrayList Test");
		ArrayList<String> family = new ArrayList<String>(5);
		System.out.println(family.addItem("Josh"));
		System.out.println(family.addItem("Mj"));
		System.out.println(family.addItem("Mom"));
		System.out.println(family.addItem("Dad"));
		System.out.println(family.addItem("Jake"));
		System.out.println(family.addItem("Ben"));
		System.out.println(family.toString());
		System.out.println();
		
		//Testing Square ArrayList
		System.out.println("Square ArrayList Test");
		ArrayList<Square> squarelist = new ArrayList<Square>(4);
		
		Square ab = new Square(2);
		Square bc = new Square (5);
		Square cd = new Square (6);
		Square de = new Square (23);
		Square ef = new Square (3);
		
		System.out.println(squarelist.addItem(ab));
		System.out.println(squarelist.addItem(bc));
		System.out.println(squarelist.addItem(cd));
		System.out.println(squarelist.addItem(de));
		System.out.println(squarelist.addItem(ef));
		System.out.println(squarelist.toString());
		System.out.println();
		
		//Testing PointThreeD ArrayList
		System.out.println("PointThreeD ArrayList Test");
		ArrayList<PointThreeD> Treasure = new ArrayList<PointThreeD>(3);
		
		PointThreeD Gold = new PointThreeD(2,6,7);
		PointThreeD Jewelry = new PointThreeD(3,1,8);
		PointThreeD Gems = new PointThreeD(5,2,7);
		PointThreeD Silver = new PointThreeD(1,1,1);
		
		System.out.println(Treasure.addItem(Gold));
		System.out.println(Treasure.addItem(Jewelry));
		System.out.println(Treasure.addItem(Gems));
		System.out.println(Treasure.addItem(Silver));
		System.out.println(Treasure.toString());
		
	}//end main

}//end class
