package exam;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Questions
{  
	public void displayQuestion()
	{
		try
		{
			BufferedReader inputStream = new BufferedReader(new FileReader("questions.txt"));
			String line = "";
			//int itr = 0;
			Scanner s = new Scanner(System.in);
			File file =new File("studentAnswers.txt");
			while(line != null)
		    { 
		    	int itr = 0;
		    	try
				{
					System.out.print("\033[H\033[2J");
					System.out.flush();
				}
				catch(Exception exeption)
				{

				}
				while(itr <= 4)
				{
					line = inputStream.readLine();
					System.out.println(line);
					itr++;	
				} 
				String studentOption = s.next();
					//file.createNewFile();
				
				FileWriter fileWritter = new FileWriter(file.getName(),true);
		        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		        bufferWritter.write(studentOption);
		        bufferWritter.newLine();
		        bufferWritter.close();
		        line = inputStream.readLine();
		 	}
		 	displayMarks();
        	file.delete();	
		}
		catch(Exception e)
		{

		}
	}
	public void displayMarks()
	{
		try
		{
			int score = 0;
			File f1 = new File("correctAnswers.txt");
			File f2 = new File("studentAnswers.txt");
			String line1 = "";
			String line2 = "";
			FileReader fr1 = new FileReader(f1);
			FileReader fr2 = new FileReader(f2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			line1 = br1.readLine();
			line2 = br2.readLine();
			System.out.println("Correct Answers \t Student Answers");
			while((line1 != null)&&(line2 != null))
			{
				System.out.println("\t" + line1 + "\t\t\t" + line2);
				if(line1.equals(line2))
				{
					score = score + 1;
				}
				line1 = br1.readLine();
				line2 = br2.readLine();
			}
			Scanner s = new Scanner(System.in);
			fr2.close();
			System.out.println("Your Score:" + score);
		}
		catch(Exception e)
		{

		}
	}
	public static void addAnswers()
		{
			try
			{
				System.out.println("Correct Answer : ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String ans = br.readLine();
				File file = new File("correctAnswers.txt");
				FileWriter fileWritter = new FileWriter(file.getName(),true);
		        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		        bufferWritter.newLine();
		        bufferWritter.write(ans);
		        bufferWritter.close();
			}
			catch(Exception e)
			{

			}
		}
}  	 