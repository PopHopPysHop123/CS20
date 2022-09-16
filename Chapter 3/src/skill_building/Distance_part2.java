package skill_building;
/*

Program: Distance_part2.java          Last Date of this Revision: September 14, 2022

Purpose: Prompt for the distance of each race segment and calculate and display the total distance.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class Distance_part2
{
	
	public static void main(String[] args) 
	{ 
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object for the input
		
		double first = 0;//creates a double for the first segment
		
		double second = 0;//creates a double for the second segment
		
		double third = 0;//creates a double for the third segment
		
		System.out.print("Please enter the distance for the first segment: ");//prompts for the first segment
		
		first = userinput.nextDouble();//records the input as "first"
		
		System.out.print("\rPlease enter the distance for the second segment: ");//prompts for the second segment
		
		second = userinput.nextDouble();//records the input as "second"
		
		System.out.print("\rPlease enter the distance for the third segment: ");//prompts for the third segment
		
		third = userinput.nextDouble();//records the input as "third"
		
		double total_d = Math.round((first + second + third) * 100.0) / 100.0;//calculates total distance
		
		System.out.println("\rThe race is going to be" + total_d + "km long.");//displays total distance
		
	}

}
/* Screen Dump
The race is 28.6km long.

*/