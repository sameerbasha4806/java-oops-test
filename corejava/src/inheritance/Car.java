package inheritance;

public class Car extends Vechicle {
	public void speed() {
		System.out.println("Car is moving 80km/hr");
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.run();
		car.speed();

	}

}
