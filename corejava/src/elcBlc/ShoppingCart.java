package elcBlc;

public class ShoppingCart {

	public static void main(String[] args) {
		OnlineShopping obj1=new OnlineShopping();
		OnlineShopping obj2=new OnlineShopping();
		
		obj1.setProductId(1);
		obj1.setProductName("shirt");
		obj1.setprice(5000);
		obj1.setquantity(3);
		System.out.println(obj1.displaydetails());
		
		System.out.println("---------------------------------");
		obj2.setProductId(2);
		obj2.setProductName("trouser");
		obj2.setprice(6000);
		obj2.setquantity(4);
		System.out.println(obj2.displaydetails());

	}
	
}
