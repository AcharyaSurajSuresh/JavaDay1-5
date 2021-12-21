package demoOfMaven.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("MyBean.xml");
		
        Employee e=(Employee)context.getBean("s2");
		e.displayEmployee();
			
		System.out.println("\n");
		
	    Books b=(Books)context.getBean("s4");
	    b.displayBooks();
	    System.out.println("\n");
	    
	    Student s=(Student)context.getBean("s1");
		s.display();
		
    }
}
