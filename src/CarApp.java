
public class CarApp {
	public static void main(String[] args) {
		Car car1 = new Car("Porsche","red", 0);
		Car car2 = new Car("Jetta", "blue", 10);
		car1.start();
		car1.accelerate();
		car1.setSpeed(50);
		car1.stop();
		car1.start();
		car2.start();
		car1.accelerate();
		car2.accelerate();
		car2.emissionCheck();
		car1.setSpeed(50);
		car1.stop();
		car1.race(car2);
	}
}
