import java.util.*;
public class Pattern36 { // Declaring a public class named "Pattern36".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// First Part: Printing a pyramid pattern with stars '*'
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 9; j++) { // Inner loop to print '*' or spaces ' ' based on the condition for each row, '9' times.

				if (j >= 6 - i && j <= 4 + i) { // If the value of 'j' is greater than or equal to (6 - i) and less than or equal to (4 + i), print '*'.
					System.out.print("*");
				} else {
					System.out.print(" "); // If the value of 'j' is outside the range (6 - i) to (4 + i), print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Second Part: Printing an inverted pyramid pattern with stars '*'
		for (int i = 1; i <= 4; i++) { // Outer loop to iterate 'i' from 1 to 4.

			for (int j = 1; j <= 9; j++) { // Inner loop to print '*' or spaces ' ' based on the condition for each row, '9' times.

				if (j >= i + 1 && j <= 10 - i - 1) { // If the value of 'j' is greater than or equal to (i + 1) and less than or equal to (10 - i - 1), print '*'.
					System.out.print("*");
				} else {
					System.out.print(" "); // If the value of 'j' is outside the range (i + 1) to (10 - i - 1), print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
