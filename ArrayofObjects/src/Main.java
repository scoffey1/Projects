
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array with the data type (ex.int[] numbers = new int[3])
		//with the size if you plan on adding values later.
		//Food[] refridgerator = new Food[4];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("HotDog");
		Food food4 = new Food("Steak");
		//adding values we created above to the Food array
		Food[] refridgerator = {food1,food2,food3,food4};
		
		//refridgerator[0] = food1;
		//refridgerator[1] = food2;
		//refridgerator[2] = food2;
		
		System.out.println(refridgerator[0].name);
		System.out.println(refridgerator[1].name);
		System.out.println(refridgerator[2].name);
		System.out.println(refridgerator[3].name);
	}

}
