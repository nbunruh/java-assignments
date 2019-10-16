import java.util.Scanner;
/* 
 * @author German, Nolan
 * @version 1
 * @
 */
public class Shoe {
	int size;
	String color;
	
	/*
	 * Constructor for the shoe
	 * Added color attribute to Shoe constructor
	 */
	Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}
	/**
	 * Method to show size
	 */
	void showSize() {
		System.out.println("Size: " + this.size);
	}
	
	/**
	 * Method to show color
	 */
	
	void showColor() {
		System.out.println("Color: " + this.color);
	}
	
	static public void main(String args[]) {
		Shoe shoe = new Shoe(7, "brown");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter shoe size:");
		shoe.size = scanner.nextInt();
		shoe.showSize();
		
	}
}