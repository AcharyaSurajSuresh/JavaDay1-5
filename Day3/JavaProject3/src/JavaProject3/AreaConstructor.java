package JavaProject3;

public class AreaConstructor {

	public static void main(String[] args) {
		AreaConstructor ac1=new AreaConstructor(5);
		AreaConstructor ac2=new AreaConstructor(5,4);
		AreaConstructor ac3=new AreaConstructor(5.55);
		ac1.details();
		ac2.details();
		ac3.details();

	}
	double area;
	AreaConstructor(int circle)
	{
		area=3.14*circle*circle;
	}
	AreaConstructor(int l,int b)
	{
		area=l*b;
	}
	AreaConstructor(double side)
	{
		area=side*side;
	}
	void details()
	{
		System.out.println("area : "+area);
	}
}
