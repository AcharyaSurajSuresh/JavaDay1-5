package demoOfMaven.mavendemo;

public class Books {
	int id;
	String publisher,price;
	
	


	public Books(int id, String publisher, String price) {
		this.id = id;
		this.publisher = publisher;
		this.price = price;
	}



	void displayBooks()
	{
		System.out.println("Books Details");
		System.out.println("Id: "+id+"\nPublisher: "+publisher+"\nPrice: "+price);
	}

}
