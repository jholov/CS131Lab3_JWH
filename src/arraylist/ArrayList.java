package arraylist;

/**
 * A Class that allows you to create an ArrayList of different Objects
 * author Jake Holovka
 */


public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	/**
   	 * Empty-argument constructor
   	 */
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 
   	
   	/**
   	 * Preferred constructor for this object
   	 * @param length
   	 */
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  /**
   * This method checks to see if Array is full then adds an item if not
   * @param item
   * @return boolean
   */
  public boolean addItem(T item) {
	  
	  if (currentItem <= arList.length -1) 
	  {		
		  arList[currentItem]=item;
		  
		  currentItem++;
		  
		  	return true;
		  
	  }else 
	  		{
		  	return false;
	  		}
	  
  }//end addItem

  /**
   * @return toString
   */
  public String toString() 
  	{
  
	  StringBuilder str = new StringBuilder();
  
	  for(int i=0; i<= arList.length-1;i++) 
  		{
	  
	  		str.append(" Element: "+i+" Value: "+arList[i].toString());
  		}
	  		return str.toString();
  
  	}//end toString
  
}//end class
