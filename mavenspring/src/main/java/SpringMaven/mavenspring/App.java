package SpringMaven.mavenspring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
    	 StudentOperations op=(StudentOperations)context.getBean("operationdemo");
    	 
    	 Student s1=new Student();
    	 s1.setRollno("abcd");
    	 s1.setId("2");
    	 s1.setName("suraj123");
    	 s1.setMarks("2634512");
    	 
	int result=     op.insert(s1);
System.out.print(result);
    	
    	
    	
    	
    }
}
