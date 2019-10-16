import java.util.Scanner;
/* 
 * @author Nolan
 * @version 1
 * @
 */
public class WorkingBoot extends Shoe {
	
	public WorkingBoot(int size, String color) {
		super(size, color);
	}

	public static void main(String[] args) {
		WorkingBoot wb = new WorkingBoot(10, "tan");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter boot size: ");
		wb.size = scanner.nextInt();
		// This will prevent nextLine method from skipping over next question
		scanner.nextLine();
		System.out.print("Enter boot color: ");
		wb.color = scanner.nextLine();
		wb.showSize();
		wb.showColor();
	}

}