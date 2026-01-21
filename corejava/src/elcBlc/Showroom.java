package elcBlc;

class Carr {
	
	String brand;
	double price;
} 
  public class Showroom{
		 void displayCar(Carr c){
			System.out.println("Car Brand: "+ c.brand);
			System.out.println("Car Price: "+ c.price);


		}

		public static void main(String[] args) {
			Carr obj1=new Carr();
			obj1.brand="Tesla";
			obj1.price=75000.5;
			Showroom obj2 =new Showroom();
			obj2.displayCar(obj1);


		}

	}


	