package skill_building;
/*

Program: Digits.java          Last Date of this Revision: September 14, 2022

Purpose: Prompt for a two-digit number and display the ones-place and tens-place digits.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class Digits
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object for the input
		
		int user_num = 0;//creates an int for the user's #
		
		System.out.print("Please type a two digit number: ");//prompts for a two-digit #
		
		user_num = userinput.nextInt();//records the input as "user_num"
		
		int tens = user_num / 10;//calculates tens-place digit
		
		int ones = user_num - (tens * 10); //calculates ones-place digit

		System.out.println("\rThe tens-place digit is " + tens + " and the ones-place digit is " + ones);//displays digits
	
	}

}
/* Screen Dump
Please type a two digit number: 35

The tens-place digit is 3 and the ones-place digit is 5

*/