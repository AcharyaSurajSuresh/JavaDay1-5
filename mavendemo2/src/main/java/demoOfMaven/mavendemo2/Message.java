package demoOfMaven.mavendemo2;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Message {
	
	public Message()
	{
		System.out.println("inside constructor------");
	}
	
	void display()
	{
		System.out.println("inside method------");
	}

	
}
