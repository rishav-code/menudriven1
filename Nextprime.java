
package Nextprime;

import java.util.Scanner;

public class Nextprime {
	/*
	 * In this method we find the next prime of the given number.
	 */
	public static Object getobject() {
		int user_input = 0, index2, index1;
		Scanner scan = new Scanner(System.in);
//Try catch is used to handle the Exception
		try {
			System.out.println("Enter the no.:");
			user_input = scan.nextInt();
		}

		catch (Exception e) {
		}
//Nested for is used
		for (index1 = user_input + 1;; index1++) {

			for (index2 = 2; index2 < index1; index2++) {
				if (index1 % index2 == 0)
					break;
			}
		

			if (index2 == index1) {
				System.out.println("Next prime no is:" + index1);
				break;
			}

		}
		return scan;
	}

}
