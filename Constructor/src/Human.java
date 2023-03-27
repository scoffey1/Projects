
public class Human {

	String name;
	int age;
	double weight;
	
	//Constructor. Use the 'this' keyword
	Human(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight =weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating ");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking beer ");
	}
    
	//This allows me to print out all the parameters at the same time
	//instead of listing each one in a print statement 
	//(ex.human1.name,human1.age,human1.weight)
	public String toString() {
		String myString = name + "\n" + age + "\n" + weight;
		return myString;
	}
}
