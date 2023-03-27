import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	   /* ArrayList = a resizable array
	    * 			  Elements can be added and removed after compilation phase
	    *             store reference data type
	    *             Need to use wrapper classes in ArrayList like Integer
		*/
		ArrayList<String> food = new ArrayList<String>();
		//add elements to ArrayLists
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		//replaces pizza because that was at the [0] element
		food.set(0, "sushi");
		food.remove(2);
		//clears the ArrayLists
		//food.clear();
		                  //Instead of .length we use .size for ArrayLists
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
