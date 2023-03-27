import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// User input for circle circumference
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = scan.nextDouble();
		circleCircumference(radius);
		scan.close();
	}
	//Circumference = 2*Pi*radius
	private static void circleCircumference(double radius){
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference of the circle with the given [ radious = "+ radius +"] =" + circumference);
	}
}
