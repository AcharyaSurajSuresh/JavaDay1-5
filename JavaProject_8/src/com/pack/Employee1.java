package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee1 {
	int id;
	String name,address,salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	void displayEmployee()
	{
		System.out.println("Employee Details");
		System.out.println("Id: "+id+"\nsalary: "+salary+"\naddress: "+address+"\nName: "+name);
	}
	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
        Employee1 e=(Employee1)context.getBean("s2");
		e.displayEmployee();
	}
}


