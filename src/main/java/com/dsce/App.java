package com.dsce;
import java.util.ResourceBundle;
public class App
{
	public int userlogin(String inuser,String inpassword)
	{
	ResourceBundle rb= ResourceBundle.getBundle("config");
	
	String username=rb.getString("username");
	String password=rb.getString("password");
	
	if(inuser.equals(username) && inpassword.equals(password))
		return 1;
	else
		return 0;
	}
}