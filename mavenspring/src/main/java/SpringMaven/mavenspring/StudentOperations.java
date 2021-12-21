package SpringMaven.mavenspring;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentOperations {
	JdbcTemplate jdbcTemplate;
	
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	 {
		 this.jdbcTemplate=jdbcTemplate; 
	 }
	
	
	

	int insert(Student stu)
	 {
		 
		 String name=stu.getName();
		 String rollno=stu.getRollno();
		 String id=stu.getId();
		 String marks=stu.getMarks();		 
		   String query="insert into Student values('"+name+"','"+rollno+"','"+id+"','"+marks+"')"; 
		        int result= jdbcTemplate.update(query);
		 
		 return  result;
	 }
	 
}
