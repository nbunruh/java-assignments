import java.lang.Math;
/* 
 * @author Nolan
 * @version 1
 * @
 */
public class Invoice {
	
	String partNumber;
	String partDescription;
	int purchaseQuantity;
	double pricePerItem;
	
	Invoice(String partNumber, String partDescription, int purchaseQuantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.purchaseQuantity = purchaseQuantity;
		this.pricePerItem = pricePerItem;
	}
	
	// method to calculate what customer owes
	// if quantity and/or price are negative, variable(s) will be set to 0
	public double getInvoiceAmount() {
		int checkQuantity = Math.max(purchaseQuantity, 0);
		double checkPrice = Math.max(pricePerItem, 0.0);
		
		double invoiceAmount = checkQuantity * checkPrice;
		return invoiceAmount;
	}

}
