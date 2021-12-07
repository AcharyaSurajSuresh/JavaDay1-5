package JavaProject4;

public class Abstract1 {
	public static void main(String[] args) {
		AnimalSound a=new AnimalSound();
		a.makeSound();
		a.eat();
	}
}

abstract class Animal{
	abstract void makeSound();

	  public void eat() {
		  System.out.println("Eating!!!");

	  }
}
 
class AnimalSound extends Animal{

	@Override
	void makeSound() {
		System.out.println("Sound!!");
	}
	
}