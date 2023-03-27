
import java. util.Scanner;

public class GeometryAreaCalculator {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int choice = scan.nextInt();
double area;
do {
  System. out.println("Geometry Area Calculator");
  System.out.println("1. Rectangle");
  System.out.println("2. Triangle");
  System.out.println("3. Circle");
  System.out.println("4. Quit");
  System. out.print("Enter your choice (1-4): ");
  choice = input.hasNextInt();

  if (choice == 1) {
    System.out.print("Enter the length: ");
    double length = input.nextDouble();
    System.out.print("Enter the width: ");
    double width = input.nextDouble();
    area = length * width;
    System.out.println("The area of the rectangle is " + area);
  } else if (choice == 2) {
    System.out.print("Enter the base: ");
    double base = input.nextDouble();
    System.out.print("Enter the height: ");
    double height = input.nextDouble();
    area = 0.5 * base * height;
    System.out.println("The area of the triangle is " + area);
  } else if (choice == 3) {
    System.out.print("Enter the radius: ");
    double radius = input.nextDouble();
    area = Math.PI * radius * radius;
    System.out.println("The area of the circle is " + area);
  } else if (choice != 4) {
    System. out.println("Invalid choice. Please try again.");
  }

  System.out.println();
} while (choice != 4);
}
}