import java.util.Scanner;
/* 
 * @author Nolan
 * @version 1
 * @
 */
public class DressShoe extends Shoe {
	
	public DressShoe(int size, String color) {
		super(size, color);
	}

	public static void main(String[] args) {
		DressShoe ds = new DressShoe(10, "black");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter shoe size: ");
		ds.size = scanner.nextInt();
		// This will prevent nextLine method from skipping over next question
		scanner.nextLine();
		System.out.print("Enter shoe color: ");
		ds.color = scanner.nextLine();
		ds.showSize();
		ds.showColor();
	}

}