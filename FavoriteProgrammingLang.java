import java.util.Scanner;
/*
 * @author Nolan
 * @version 1
*/
public class FavoriteProgrammingLang {
	
	public static void main(String[] args) {
		String choice;
		String choiceCap;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your favorite programming language: ");
		choice = input.nextLine();
		choiceCap = choice.substring(0, 1).toUpperCase() + choice.substring(1);
		
		switch (choiceCap) {
		case "Java":
			System.out.println("Nice! I'm learning " + choiceCap + " now!");
			break;
		case "Python":
			System.out.println("Cool! " + choiceCap + " is used a lot in data science.");
			break;
		case "Javascript":
			System.out.println("Ah, " + choiceCap + " is great to know for web development.");
			break;
		case "PHP":
			System.out.println(choiceCap + " is a must-know if you are working with WordPress!");
			break;
		case "Ruby":
			System.out.println(choiceCap + ", huh?" + " Interesting.");
			break;
			default:
			System.out.println(choiceCap + "? " + "I'm not sure how to respond to that...");
		
		}
	}
}