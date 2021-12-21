package demoOfMaven.mavendemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class MyMessage {
	
	Message msg;

	public Message getMsg() {
		return msg;
	}
    
	@Autowired
	public void setMsg(Message msg) {
		this.msg = msg;
	}
	
	void displayMsg()
	{
		msg.display();
	}
	

}
