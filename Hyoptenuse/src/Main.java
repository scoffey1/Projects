import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("Enter side x: ");
		x = scanner.nextDouble();
		System.out.print("Enter side y: ");
		y = scanner.nextDouble();
		//Find The hypotenuse of the given values
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypontenuse is : " +z);
		
		scanner.close();
		

	}

}
