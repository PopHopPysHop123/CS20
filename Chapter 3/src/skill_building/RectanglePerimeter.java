package skill_building;
/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 13, 2022

Purpose: Calculate and display the perimeter of a rectangle with width 4 and length 13.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
public class RectanglePerimeter
{

	public static void main(String[] args)
	{
		int w = 4;//records 4 as "w" (width)
		
		int l = 13;//records 13 as "l" (length)
		
		int P = (l*2) + (w*2);//calculates the perimeter and records it as "P" (perimeter)
		
		
		System.out.println("The perimeter of the rectangle is " + P +".");//displays the perimeter

	}

}
/* Screen Dump
The perimeter of the rectangle is 34.

*/