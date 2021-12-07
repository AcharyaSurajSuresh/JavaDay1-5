package JavaProject4;

public class Abstract2 extends MotorBike {

	public static void main(String[] args) {
		Abstract2 a=new Abstract2();
		a.brake();
	}

	@Override
	void brake() {
		System.out.println("Brake!!");
	}

}
abstract class MotorBike {
	  abstract void brake();
}
