package JavaProject3;

public class CarConstructor {

	public static void main(String[] args) {
		CarConstructor c1=new CarConstructor("BMW","500000");
		c1.displayDetails();
	}
	String brandName,price;
	CarConstructor(String n,String m)
	{
		 brandName=n;
		 price=m;
	}
	void displayDetails()
	{
		System.out.println("Brand is: "+brandName+"\nprice is: "+price);
	}

}
