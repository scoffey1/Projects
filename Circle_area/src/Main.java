import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//User input to calculate the are of a circle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of the circle: ");
		double radius = sc.nextDouble();
		calculateArea(radius);
		
		sc.close();
	}
	//Calculates the area of a the circle given by the user input
	private static void calculateArea(double radius) {
	    double area = radius * radius * Math.PI;
	    System.out.println("The area of the circle with [radius = " + radius + "]: " + area);
	}
	
	
}
