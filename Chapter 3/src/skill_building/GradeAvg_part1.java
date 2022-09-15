package skill_building;
/*

Program: GradeAvg_part1.java          Last Date of this Revision: September 15, 2022

Purpose: Prompt for five grades as integer values and calculate and display the average of the grades.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class GradeAvg_part1 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object
		
		int g1 = 0;//creates an int for the 1st grade
		
		int g2 = 0;//creates an int for the 2nd grade
		
		int g3 = 0;//creates an int for the 3rd grade
		
		int g4 = 0;//creates an int for the 4th grade
		
		int g5 = 0;//creates an int for the 5th grade
		
		System.out.print("Please enter a grade: ");//prompts for a grade
		
		g1 = userinput.nextInt();//records the input as "g1"
		
		System.out.print("\rPlease enter another grade: ");//prompts for another grade
		
		g2 = userinput.nextInt();//records the input as "g2"

		System.out.print("\rPlease enter another grade: ");//prompts for another grade
		
		g3 = userinput.nextInt();//records the input as "g3"
		
		System.out.print("\rPlease enter another grade: ");//prompts for another grade
		
		g4 = userinput.nextInt();//records the input as "g4"
		
		System.out.print("\rPlease enter another grade: ");//prompts for another grade
		
		g5 = userinput.nextInt();//records the input as "g5"
		
		double g_avg = Math.round(((g1 + g2 + g3 + g4 + g5) / (double)5)*1.0)/1.0;//calculates the average
		
		System.out.println("\rYour grade average is " + g_avg + "%.");//displays the grade average
	}

}
/* Screen Dump
Please enter a grade: 77

Please enter another grade: 85

Please enter another grade: 56

Please enter another grade: 81

Please enter another grade: 90

Your grade average is 78.0%.

*/