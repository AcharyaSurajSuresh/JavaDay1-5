package demoOfMaven.mavendemo2;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	public Address() 
	{
		System.out.println(" Constructor Address--");
	}
	void displayAddress()
	{
		System.out.println("Student Address");
	}
	
	
}
