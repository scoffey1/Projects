
public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Steve",28,180);
		Human human2 = new Human("Dale",44,220);
		
		//each object is using different method
		human1.drink();
		
		
		// to print out objects attribute use objectname
		//human.(attribute)
		System.out.println(human1.toString()+ "\n");
		human2.eat();
		System.out.println(human2.toString());
		
	}

}
