package exam;

import java.io.*;
import java.util.*;

public class AdminQuestions  
{
	public static void addData(String question) throws IOException, FileNotFoundException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		File file =new File("questions.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.newLine();
        bufferWritter.newLine();
        bufferWritter.write(question);
        bufferWritter.close();
	}
	public static void addData(String option1,String option2, String option3, String option4) throws IOException, FileNotFoundException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		File file =new File("questions.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.newLine();
        bufferWritter.write(option1);
        bufferWritter.newLine();
        bufferWritter.write(option2);
        bufferWritter.newLine();
        bufferWritter.write(option3);
        bufferWritter.newLine();
        bufferWritter.write(option4);
        bufferWritter.close();
	}
	public static void inputData() throws IOException
	{
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" ");
		System.out.println("Welcome!!!");
		System.out.println("-------------------------------");
		System.out.println("Question :");
		String adminQuestionText = br.readLine();
		addData(adminQuestionText);
		System.out.println("Option1 :");
		String adminOptionOne = br.readLine();
		adminOptionOne = "(1)" + adminOptionOne;
		System.out.println("Option 2 :");
		String adminOptionTwo = br.readLine();
		adminOptionTwo = "(2)" + adminOptionTwo;
		System.out.println("Option 3 :");
		String adminOptionThree = br.readLine();
		adminOptionThree = "(3)" + adminOptionThree;
		System.out.println("Option 4 :");
		String adminOptionFour = br.readLine();
		adminOptionFour = "(4)" + adminOptionFour;
		addData(adminOptionOne,adminOptionTwo,adminOptionThree,adminOptionFour); 
		Questions.addAnswers();
	}
}