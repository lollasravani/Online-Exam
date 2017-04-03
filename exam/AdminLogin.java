package exam;

import java.io.*;
import java.util.*;
import java.*;


public class AdminLogin extends Authentication
{
	String username = "Admin";
	String password = "Admin";
	String name = "";
	char[] pass;

	public int login()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Username:");
			name = br.readLine();
			Console console;
			console = System.console();
			//System.out.println("Enter Password");
			//pass = br.readLine();
		    pass = console.readPassword("Enter your secret password: ");
				
		}
		catch(Exception e)
		{

		}
		int flag = -1;
		if(name.equals(username) && password.equals(new String(pass)))
		{
			flag = 1;
		}
		else
		{
			
			flag = 0;
		}
		return flag;
	}
}
		
		