package com.pack;

public class Student1 {
	String Stuname,rollno;

	public String getStuname() {
		return Stuname;
	}

	public void setStuname(String stuname) {
		Stuname = stuname;
	}
	
	void display()
	{
		System.out.println("Name: "+Stuname+" RollNo: "+rollno);
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

}
