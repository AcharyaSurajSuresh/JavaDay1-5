package JavaProject4;
import java.util.*;
interface IVehicle{
	public double tuneUpCost();
	public boolean canCarry(int numPassengers);
}
public class Interface2 implements IVehicle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Interface2 i=new Interface2();
		double tuneCost=i.tuneUpCost(); 
		System.out.println("Tune Up cost is :"+tuneCost);
		System.out.println("enter the number of passage: ");
		int x=sc.nextInt();
		boolean carry=i.canCarry(x);
	}
	public double tuneUpCost() {
		return 1000.50;
	}
	public boolean canCarry(int x) {
		if(x>200) {
			System.out.println("vehicle cannot hold given "+x+" of passengers");
			return false;
		}
		else {
			System.out.println("vehicle can hold given "+x+" of passengers");
			return true;
		}
		
	}

}





