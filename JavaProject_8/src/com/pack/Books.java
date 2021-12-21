package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Books {
	int id;
	String Publisher,Price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPublisher() {
		return Publisher;
	}
	
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	
	public String getPrice() {
		return Price;
	}
	
	public void setPrice(String price) {
		Price = price;
	}
	void displayBooks()
	{
		System.out.println("Books Details");
		System.out.println("Id: "+id+"\nPublisher: "+Publisher+"\nPrice: "+Price);
	}
	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
        Books b=(Books)context.getBean("s3");
		b.displayBooks();
	}

}
