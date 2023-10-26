package com.lbrce.devops;

import java.io.IOException;
import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String inUID,String inPSW)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UID=rb.getString("uname");
		String PSW=rb.getString("psw");
		if(inUID.equals(UID)&&inPSW.equals(PSW))
			return true;
		else
			return false;
	}
	public static void main(String args[])throws IOException
	{
		System.out.println(new UserValidation().check("srin","srinu@12345"));
	}
}
