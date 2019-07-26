
package Factorial;

import java.util.Scanner;

public class Factorial {
	/*
	 * In this method we find the next prime of the given number.
	 */
	public static Object getobject() {
		long user_input, index, factorial = 1;

		System.out.println("Enter an integer to calculate it's factorial");
		Scanner  scan= new Scanner(System.in);

		user_input = scan.nextInt();

		if (user_input < 0)
			System.out.println("Number should be non-negative.");
		else {
			for (index = 1; index <= user_input; index++)
				factorial = factorial * index;

			System.out.println("Factorial of " + user_input + " is = " + factorial);
		}
		return scan;
	}
}
