
public class CarApp {
	public static void main(String[] args) {
		Car car1 = new Car("Porsche","red", 0);
		Car car2 = new Car("Jetta", "blue", 10);
		car1.start();
		System.out.print(car1.accelerate());
		System.out.print(car1.setSpeed(50));
		System.out.print(car1.stop());
		car1.start();
		car2.start();
		System.out.print(car1.accelerate());
		System.out.print(car2.accelerate());
		car2.emissionCheck();
		System.out.print(car1.setSpeed(50));
		System.out.print(car1.stop());
		car1.race(car2);
	}
}
