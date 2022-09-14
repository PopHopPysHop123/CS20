package skill_building;
/*

Program: GradeAvg.java          Last Date of this Revision: September 15, 2022

Purpose: Ask the user for five grades as integer values and calculate and display the average of the grades.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class GradeAvg 
{

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		int g1 = 0;//creates an int for the 1st grade
		
		int g2 = 0;//creates an int for the 2nd grade
		
		int g3 = 0;//creates an int for the 3rd grade
		
		int g4 = 0;//creates an int for the 4th grade
		
		int g5 = 0;//creates an int for the 5th grade
		
		System.out.print("Please enter a grade: ");//prompts for a grade
		
		g1 = userinput.nextInt();//records the input as "g1"
		
		System.out.print("Please enter another grade: ");//prompts for another grade
		
		g2 = userinput.nextInt();//records the input as "g2"

		System.out.print("Please enter another grade: ");//prompts for another grade
		
		g3 = userinput.nextInt();//records the input as "g3"
		
		System.out.print("Please enter another grade: ");//prompts for another grade
		
		g4 = userinput.nextInt();//records the input as "g4"
		
		System.out.print("Please enter another grade: ");//prompts for another grade
		
		g5 = userinput.nextInt();//records the input as "g5"
		
		double g_avg = Math.round(((g1 + g2 + g3 + g4 + g5) / (double)5)*1.0)/1.0;
		
		System.out.print(g_avg);
	}

}
/* Screen Dump

*/