
package Fibonacci;


import java.util.Scanner;

public class Fibonacci {
	/*
	 * In this Method we find the Fabonacci series.
	 * @param scan takes the input from the user
	 */
	public static Object getobject() {

		Scanner scan = new Scanner(System.in);
		int number1 = 0, number2 = 1, temporary = 0;
		System.out.print("Enter number of terms to be printed: ");
		int user_input = scan.nextInt();

		System.out.print("Fibonacci Series: " + number1 + " " + number2);
		// For loop is used
		for (int index = 3; index <= user_input; index++) {
			temporary = number1 + number2;
			System.out.print(" " + temporary);
			// Swapping is done
			number1 = number2;
			number2 = temporary;
		}
		System.out.println();
		return user_input;
	}

}
