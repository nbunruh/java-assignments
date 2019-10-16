/* 
 * @author Nolan
 * @version 1
 * @
 */
public class ColaVendingMachine {
	
	int bottleAmount = 500;
	double pricePerBottle = 1.99;
	
	// method to deduct the number of bottles sold from inventory
	public void sellBottle(int bottlesSold) {
		bottleAmount -= bottlesSold;
		System.out.println("There are " + bottleAmount + " bottles left");
	}
	
	// method to add more bottles to inventory
	public void restock(int bottlesRestocked) {
		bottleAmount += bottlesRestocked;
		System.out.println("Just added " + bottlesRestocked + " more bottles! There are now " + bottleAmount + " in stock.");
	}
	
	public static void main(String[] args) {
		ColaVendingMachine cvm = new ColaVendingMachine();
		System.out.println(cvm.bottleAmount);
		System.out.println(cvm.pricePerBottle);
		cvm.sellBottle(45);
		cvm.restock(200);
	}

}
