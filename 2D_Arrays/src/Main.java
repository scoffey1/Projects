
public class Main {

	public static void main(String[] args) {
		//2D array = an array of arrays
		/*Another way of entering array values
		 * String[][] cars = {
		 * 						{"Camaro","Corevette","Silverado"},
		 * 						{"Mustang","Bugatti","Porche:}
		 * 						{"Tesla", "Lambo","Bently"}
		 * 					  };		 
		 */
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corevette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Bugatti";
		cars[1][2] = "Porche";
		cars[2][0] = "Tesla";
		cars[2][1] = "Lambo";
		cars[2][2] = "Bently";
		
		//this will display the 2D array of cars that we have
		for (int i=0; i<cars.length; i++){
			System.out.println();
			for (int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j] + " ");
			}
		}
		
		
	}
}
