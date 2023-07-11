package vehicle;
abstract class Veh{
	 abstract void start(); {
		System.out.println("vehicle started");
	}
	abstract void stop(); {
		System.out.println("vehicle stopped");
	}
}
class Car extends Veh{

	@Override
	void start() {
		System.out.println("car started");
		
	}

	@Override
	void stop() {
		System.out.println("car stopped");
		
		
	}
	
	
}
class Motorcycle extends Veh{

	@Override
	void start() {
		
		System.out.println("motorcycle started");
	}

	@Override
	void stop() {
		
		System.out.println("motorcycle stopped");
	}
	
}
public class Vehicle {

	public static void main(String[] args) {
		Motorcycle m=new Motorcycle();
		m.start();
		m.stop();
		
		Car c=new Car();
		c.start();
		c.stop();

	}

}
