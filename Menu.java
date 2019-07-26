
package MENUDRIVEN;

import java.util.Scanner;

import Factorial.Factorial;
//Packages are imported
import Fibonacci.Fibonacci;
import Nextprime.Nextprime;


public class Menu {
	public static void main(String[] args) {
		/*
		 * This is Main Method, showing the Menu Option for the User. 
		 */		
	
		do {

			Scanner scan = new Scanner(System.in);		

		    System.out.println("Menu:Select The programme");
			System.out.println("1:Fibonacci numbers");
			System.out.println("2:Next prime");
			System.out.println("3:Find Factorial");
			System.out.println("4:Exit");
			/*
			 * @user_input: This is parameter used for storing input from the user
			 */
			
			
			int user_optioninput = scan.nextInt();
			/*
			 * In this Method, Program take input of user choice and select the case accordingly
			 */
			switch (user_optioninput) {
			case 1:

				System.out.println("Calculate Fibonacci");
				Fibonacci.getobject();
				break;

			case 2:

				System.out.println("Calculate Nextprime");
				Nextprime.getobject();
				break;

			case 3:

				System.out.println("Calculate Factorial");
				Factorial.getobject();
				break;

			case 4:
				System.out.println("Exit");
				System.exit(0);

			default:
				System.out.println("invalid input !!! Try again");
				return;

			}
			
		} 
		/*
		 * While is used for continouis display of Menu
		 */		
		while (1 > 0);
	}
}
