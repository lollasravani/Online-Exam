import exam.*;
import java.io.*;
import java.util.*;

class OnlineExam
{
	public static void main(String[] args)
	{

		Questions qes = new Questions();
		AdminLogin adminLogin = new AdminLogin();
		AdminAdd adminadd = new AdminAdd();
		int initialOption = 0;

		System.out.println("Press 1 to start the test");
		System.out.println("Press 2 for the admin to login");
		System.out.println("Press 3 for the faculty to login");
		Scanner s = new Scanner(System.in);
		initialOption  = s.nextInt();
		switch(initialOption)
		{
			case 1 :	StudentLogin stuLogin = new StudentLogin();
						int checkStudentLogin = stuLogin.login();
						if(checkStudentLogin == 1)
						{
							qes.displayQuestion();
						}
						else
						{
							System.out.println("xx---Please enter correct information---xx");
						}
						break;
			case 2 :  	int checkAdminLogin = adminLogin.login();
						if(checkAdminLogin == 1)
						{
							try
							{
								System.out.print("\033[H\033[2J");
								System.out.flush();
								adminadd.add();
							}
							catch(Exception exeption)
							{

							}
						}
						else
						{
							System.out.println("xx---Please enter correct information---xx");
						}
						break;
			case 3  :   FacultyLogin facLogin = new FacultyLogin();
						int checkFacultyLogin = facLogin.login();
						if(checkFacultyLogin == 1)
						{
							try
							{
								AdminQuestions.inputData();
							}
							catch(Exception e)
							{

							}
						}
						else
						{
							System.out.println("xx---Please enter correct information---xx");
						}
						break;
		}
	
    }
}