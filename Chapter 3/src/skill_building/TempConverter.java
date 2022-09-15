package skill_building;
/*

Program: TempConverter.java          Last Date of this Revision: September 15, 2022

Purpose: Prompt for a Fahrenheit temp. and calculate and display the corresponding Celsius temp.

Author: Li Tan, 
School: CHHS
Course: Computer Programming 20

*/
import java.util.Scanner;
public class TempConverter
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);//creates a scanner object

		int F_temp = 0;//create an int for the Fahrenheit temp.
		
		System.out.print("Please enter a temperature in fahrenheit: ");//prompts for a Fahrenheit temp.
		
		F_temp = userinput.nextInt();//records the input as "F_temp"
		
		double C_temp = Math.round((((double)F_temp - 32) * 5 / 9)*10.0)/10.0;//calculates the corresponding Celsius temp.
		
		System.out.println("\rThe corresponding Celsius temperature is " + C_temp + "°C.");//displays the Celsius temp.
		
	}

}
/* Screen Dump
Please enter a temperature in fahrenheit: 89

The corresponding Celsius temperature is 31.7°C.

*/