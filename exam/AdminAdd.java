package exam;

import java.io.*;
import java.util.*;
import java.*;

public class AdminAdd implements Admin
{
	public void add() throws IOException, FileNotFoundException
	{
		System.out.println("Do you want to add???");
		System.out.println("1:Faculty\t2:Student\nPress any key if you dont't want to add");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		if(choice == 1)
		{
			System.out.println("Enter the name of faculty to be added");
			String facultyName = br.readLine();
			System.out.println("Enter the password of faculty to be added");
			String facultyPass = br.readLine();
			File faculty = new File("Faculty.txt");
			if(!faculty.exists())
			{
				faculty.createNewFile();
			}
			FileWriter fr1 = new FileWriter(faculty.getName(),true);
			BufferedWriter brf = new BufferedWriter(fr1);
	        brf.newLine();
	        brf.write(facultyName + "," + facultyPass);
	        brf.close();
		}
		else if(choice == 2)
			{
				System.out.println("Enter the number of students you wish to add");
				int n = Integer.parseInt(br.readLine());
				int i=0;
				do
				{
					System.out.println("Enter the name of " + i + 1 + " student to be added");
					String studentName = br.readLine();
					System.out.println("Enter the password of student to be added");
					String studentPass = br.readLine();
					File student = new File("Student.txt");
					if(!student.exists())
					{
						student.createNewFile();
				    }
					FileWriter fr2 = new FileWriter(student.getName(),true);
					BufferedWriter brs = new BufferedWriter(fr2);
			        brs.newLine();
			        brs.write(studentName + "," + studentPass);
			        brs.close();
			        i++;
				}while(i<n);
			}
	
	}
}