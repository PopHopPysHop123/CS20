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
		Scanner userinput = new Scanner(System.in);//creates a scanner object
		
		int g = 0;//creates an int for the grade
		
		//for (let i = 0; i)
		System.out.print("Please enter a grade: ");//prompts for a grade
		
		g = userinput.nextInt();//records the input as "g"
		
		g += g;
		
		//calculates the average
		
		System.out.println("\rYour grade average is " + g + ".");//displays the grade average
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