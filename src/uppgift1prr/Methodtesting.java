package uppgift1prr;

public class Methodtesting {
	
	public static void main(String[] args) {
		
		System.out.println(Methods.min(5, 6));
		System.out.println("Min färdig");
		
		System.out.println(Methods.max(77, 12));
		System.out.println("Max färdig");
		
		System.out.println(Methods.reverse("Dont input 'Alabama' by itself, it is the same both ways"));
		
		System.out.println(Methods.tiotal(2));
		System.out.println("Tiotal färdig");
		
		System.out.println(Methods.backwards(228));
		System.out.println("Backwards färdig");
		
		System.out.println(Methods.fakultet(5));
		System.out.println("Fakultet färdig");
		
		System.out.println("Hello there " + Methods.askForName() + ", thank you for telling me your name!");
		System.out.println("askForName färdig");
		
		System.out.println(Methods.count('l', "Hello"));
		System.out.println("Count färdig");
	}

}
