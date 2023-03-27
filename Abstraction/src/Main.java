
public class Main {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantiated, but can have a subclass
		//            abstract methods are declared without an implementation
		
		// Vehicle vehicle = new Vehicle(); Cannot instantiate because it is abstract
		// Adds a layer of security
		Car car = new Car();
		
		car.go();

	}

}
