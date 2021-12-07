package JavaProject3;

public class Constructor1 {

	    public static void main(String aa[])
	    {
	         Constructor1 c1=new Constructor1("12","35000");
	         System.out.print(c1.getDetails());
	    }

	    String id,salary;

	    Constructor1(String x,String  sal)
	        {
	            id=x;
	            salary=sal;
	        }    

	    String getDetails()
	    {
	        return id+" "+salary;
	    }
	}


