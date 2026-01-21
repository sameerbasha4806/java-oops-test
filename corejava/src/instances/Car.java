package instances;

public class Car {
	static String showroomName;
	String modelName;
	int price;
	public void displayDetails() {
		System.out.println("Showroom Name: "+showroomName);
		System.out.println("Car Model: "+modelName);
		System.out.println("Car Price: "+price);
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		Car obj1=new Car();
		Car.showroomName="Elite Motors";
		obj1.modelName="Tesla Model S";
		obj1.price=80000;
		obj1.displayDetails();
		Car obj2=new Car();
		obj2.modelName="BMW X5";
		obj2.price=75000;
		obj2.displayDetails();
				
	}

}
