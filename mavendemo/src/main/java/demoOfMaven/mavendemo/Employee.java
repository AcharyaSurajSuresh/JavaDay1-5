package demoOfMaven.mavendemo;

public class Employee {
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
	}

