package skill_building;
/*

Program: CircleCircumference.java          Last Date of this Revision: September 16, 2022

Purpose: Prompt for a radius value and calculate and display the circumference of the circle.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class CircleCircumference
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object for the input
		
		double r = 0;//creates a double for the radius
		
		System.out.print("Please enter the value of the radius: ");//prompts for a radius value

		r = userinput.nextDouble();//records the input as "r"
		
		double c = Math.round((2 * 3.14159 * r) * 100.0) / 100.0;//calculates circumference
		
		System.out.println("\rThe circumference of the circle is " + c + ".");//displays circumference
		
	}

}
/* Screen Dump
Please enter the value of the radius: 18

The circumference of the circle is 113.1.

*/