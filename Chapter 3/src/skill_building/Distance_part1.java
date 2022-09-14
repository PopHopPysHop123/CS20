package skill_building;
/*

Program: Distance_part1.java          Last Date of this Revision: September 14, 2022

Purpose: Calculate and display the total distance of a race with three segments.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
public class Distance_part1
{

	public static void main(String[] args) 
	{
		double first = 12.2;//records 12.2 as "first" (first segment) 
		
		double second = 10.6;//records 10.6 as "second" (second segment)
		
		double third = 5.8;//records 5.8 as "third" (third segment)
		
		double total_d = Math.round((first + second + third)*100.0)/100.0;//calculates the total distance
		
		System.out.println("The race is " + total_d + "km long.");//displays the total distance
		
	}

}
/* Screen Dump
The race is 28.6km long.

*/