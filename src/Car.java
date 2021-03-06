
public final class Car extends Vehicle{
	private String carType;
	private String carColor;
	private int carSpeed;
	private Driver d = new Driver("Bob");
	public Car(){
		super();
		carType = "Porsche";
		carColor = "red";
		carSpeed = 0;
	}
	public Car(String inputType, String inputColor, int inSpeed){
		super();
		carType = inputType;
		carColor = inputColor;
		carSpeed = inSpeed;
	}
	@Override
	public String accelerate(){
		return ("The " + carColor + " " + carType + " is accelerating\n");
	}
	public void start(){
		System.out.printf("The %s %s is starting\n",carColor, carType);
	}
	public String setSpeed(int speed){
		carSpeed = speed;
		return ("The " + carColor + " " + carType + " is going " + Integer.toString(speed) + " mph\n");
	}
	@Override
	public String stop(){
		carSpeed = 0;
		return "The " + carColor + " " + carType + " is stopped\n";
	}
	public void setType(String intype){
		carType = intype;
	}
	public String getType(){
		return carType;
	}
	public void setColor(String incolor){
		carColor = incolor;
	}
	public String getColor(){
		return carColor;
	}
	public int getSpeed(){
		return carSpeed;
	}
	public void emissionCheck(){
		int temp = carSpeed;
		carSpeed = 0;
		System.out.printf("The %s %s is stopping to have its emissions checked.\n",carColor, carType);
		System.out.printf("The %s %s passed its emission test\n",carColor, carType);
		carSpeed = temp;
	}
	public void race(Car otherCar){
		if(carSpeed > otherCar.carSpeed){
			System.out.printf("The %s %s just passed the %s %s\n",carColor, carType, otherCar.carColor, otherCar.carType);
		}
		else{
			System.out.printf("The %s %s just passed the %s %s\n", otherCar.carColor, otherCar.carType, carColor, carType);
		}
	}
	public void whoDrive() {
		// TODO Auto-generated method stub
		System.out.printf("The %s %s is being driven by %s\n", carColor, carType, d.getName());
	}
}
