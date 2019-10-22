/*
 * @author Nolan
 * @version 1
*/
public class Dog {
	int size;
	
	void bark(int size) {
		if (size > 0 && size <= 5) {
			System.out.println("Yip! Yip!");
		} else if (size > 5 && size <= 10) {
			System.out.println("Ruff! Ruff!");
		} else if (size > 10) {
			System.out.println("Bark! Bark!");
		} else {
			System.out.println("Please enter a positive integer");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog rover = new Dog();
		rover.bark(1);
		rover.bark(6);
		rover.bark(12);
	}

}
