import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// User input for area of rectangle/square
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of side 1: ");
		Double length = scan.nextDouble();
		System.out.print("Enter the length of side 2: ");
		Double width = scan.nextDouble();
		sArea(length, width);
		scan.close();
	}
	
	private static void sArea(Double length, Double width) {
		Double area = (length * width);
		System.out.println("The area of the Dqaure/Rectangle " + area);
	}
	
	
}
