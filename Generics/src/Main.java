/*public class Main {

	public static void main(String[] args) {
		// Generics = enable types(classes and interfaces) to be parameters when defining:
		//            classes, interfaces and methods..
		//            A benefit is to eliminate the need to create multiple versions 
		//            of methods or classes for various data types.
		//            Use 1 version for all reference data types
		//System.out.println();
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {5.1,6.2,7.3,8.4,9.5};
		//Character[] charArray = {'H','E','L','L','O'};
		//String[] stringArray = {"B","Y","E"};
		displayArray(intArray);
		displayArray(doubleArray);
		System.out.println(intArray);
	}
	private static void displayArray(Double[] doubleArray) {
		// TODO Auto-generated method stub
		
	}
	public static void displayArray (Integer[] array) {
		for (Integer x : array) {
			System.out.println(x+ " ");
		}
		System.out.println();
	}
}
*/


//----------------------- Generic Method -----------------------
public class Main {



   public static void main(String args[]) {
	  
      Integer[] intArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
      Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
      String[] stringArray = {"B","Y","E"};
      
      System.out.print("Integer Array: ");
      displayArray(intArray);
      //System.out.println(firstIndex(intArray));

      System.out.print("Double Array: ");
      displayArray(doubleArray);
      //System.out.println(firstIndex(doubleArray));

      System.out.print("Character Array: ");
      displayArray(charArray);
      //System.out.println(firstIndex(charArray));
      
      System.out.print("String Array: ");
      displayArray(stringArray);
      //System.out.println(firstIndex(charArray));
      
   }
   
   // Generic method
   public static <Thing> void displayArray(Thing[] array) {

      for(Thing x : array) {
         System.out.print(x+" ");
      }
      System.out.println();
   }
  
   // Generic method with generic return type 
   public static <Thing> Thing firstIndex(Thing[] array) {

		return array[0];
   }
}