package Vezbi;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv = new Invoice();

		inv.setQuantity(5);
		inv.setPrice(3);
		Invoice inv2 = new Invoice("Num168", "Description of the product", 5, 3);

		System.out.println(" Proba " + inv.getInvoiceAmount(inv.getQuantity(), inv.getPrice()));
		System.out.println("The product: " + inv2.getNumber() + ", with description: " + inv2.getDescription()
				+ ", quantity of the item: " + inv2.getQuantity() + ", and price of the product: " + inv2.getPrice()
				+ ", the invoice amount is = " + inv2.getInvoiceAmount(inv2.getQuantity(), inv2.getPrice()));

	}

}
