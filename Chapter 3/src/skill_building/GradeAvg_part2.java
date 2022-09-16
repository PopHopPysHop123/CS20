package skill_building;
/*

Program: GradeAvg_part2.java          Last Date of this Revision: September 16, 2022

Purpose: Add grades as they are entered by the user and calculate and display the average of the grades as a %.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
import java.text.NumberFormat;
public class GradeAvg_part2 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object for the input
		
		int input = 0;//creates an int for the input
		
		int g = 0;//creates an int for the grade
		
		for (int i = 0; i<5; i++)//repeats the code in brackets 5 times
		{
			System.out.print("Please enter a grade: ");//prompts for a grade
		
			input = userinput.nextInt();//records the input 
		
			g += input;//adds the input to the grade
		}
		
		double g_avg = Math.round((((double)g / 5) / 100) * 100.0) / 100.0;//calculates average
		
		NumberFormat percent = NumberFormat.getPercentInstance();//creates NumberFormat object for percents
		
		System.out.println("\rYour grade average is " + percent.format(g_avg) + ".");//displays grade average
	}

}
/* Screen Dump
Please enter a grade: 77
Please enter a grade: 85
Please enter a grade: 56
Please enter a grade: 81
Please enter a grade: 90

Your grade average is 78%.

*/