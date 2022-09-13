/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Helping user with wifi diagnosis and then finding a solution for connectivity 
 * Due: 9/12/2022
 * Platform/compiler: Mac OS / terminal
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Hayat Khan
*/

import java.util.Scanner;

public class WifiDiagnosis 
{
	public static void main (String []args) 
	{
		Scanner HPScanner = new Scanner(System.in); //creating a scanner class
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. ");
		System.out.println("First step: reboot your computer \nAre you able to connect with the internet? (yes or no)");
		String answer = HPScanner.next(); //taking in user's answer
		//control sequence and printing the correct reply to the user's answer
		//step 1
		if (answer.equals("yes")) 
		{
			System.out.println("Rebooting your computer seemed to work.");
		}
		//step 2
		else 
			//if answer is no
		{
			System.out.println("Second step: reboot your router\nNow are you able to connect with the internet? (yes or no): ");
					
			 answer = HPScanner.next();
			 if (answer.equals("yes")) 
				{
					System.out.println("Rebooting your router seemed to work.");
				}
			//step 3
				else 
					//if answer is no
				{
					System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n"
							+ "Now are you able to connect with the internet? (yes or no): ");
							
					 answer = HPScanner.next();
					 if (answer.equals("yes")) 
						{
							System.out.println("Plugging your router firmly seemed to work.");
						}
					//step 4
						else 
							//if answer is no
						{
							System.out.println("Fourth step: move your computer closer to your router\n"
									+ "Now are you able to connect with the internet? (yes or no): ");
									
							 answer = HPScanner.next();
							 if (answer.equals("yes")) 
								{
									System.out.println("Moving your computer closer to your router seemed to work.");
								}
							//step 5
								else 
									//if answer is no
								{
									System.out.println("Fifth step: contact your ISP\n"
											+ "Make sure your ISP is hooked up to your router.");										
						}
				}
		}
		System.out.println("\nProgrammer name: Hayat Khan\nAssignment 1\nDue date: 09/12/22");
		System.exit(0);
	}

}
}
