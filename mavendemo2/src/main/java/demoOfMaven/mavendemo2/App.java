package demoOfMaven.mavendemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("msgFile.xml");
    	MyMessage pass=(MyMessage)context.getBean("MyMsg");
    	System.out.println("\n");
    	pass.displayMsg();
    	
    	Student Spass=(Student)context.getBean("MsgStu");
    	Spass.displayStu();
    	
    	Employee Epass=(Employee)context.getBean("MsgEmp");
    	Epass.displaySal();
    }
}
