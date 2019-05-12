package Vezbi;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Invoice() {
		super();
	}

	public Invoice(String number, String description, int quantity, double price) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public double getInvoiceAmount(int quantity, double price) {

		if (price < 0) {
			price = 0;
		}
		if (quantity < 0) {
			quantity = 0;
		}

		double am = quantity * price;

		return am;

	}

}
