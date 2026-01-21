package elcBlc;

public class OnlineShopping {
	int productId;
	String productName;
	double price;
	int quantity;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setProductId(int Id) {
		productId=Id;
	}
	public void setProductName(String name) {
		productName=name;
	}
	public void setprice(int Price) {
		price=Price;
	}
	public void setquantity(int Quantity) {
		quantity=Quantity;
	}
	public String displaydetails() {
		return "product Id: "+productId+ "\nproduct Name: "+productName+  "\nprice: "+price+ "\nquantity: "+quantity;
	}
	
}
