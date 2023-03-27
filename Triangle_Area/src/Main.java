import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// User input for are of triangle
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = scan.nextDouble();
		System.out.print("Enter height: ");
		double height = scan.nextDouble();
		triangleArea(base, height);
		scan.close();
	}
	//Output of triangle area
	private static void triangleArea(Double base, Double height) {
		Double area = ((height * base)/2);
		System.out.print("The area of the triangle is: " + area);
	}
}
