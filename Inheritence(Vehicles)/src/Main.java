
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car = new Car();
		car.go();
		Bycicle bike = new Bycicle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}

}
