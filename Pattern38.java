import java.util.*;
public class Pattern38 { // Declaring a public class named "Pattern18".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// First Part: Printing a pattern of characters (alphabets) in decreasing order from 'F' to 'A'
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print characters based on the condition for each row, '5' times.

				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print the character corresponding to ASCII code (70 - i).
					System.out.print((char)(70 - i));
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Second Part: Printing a pattern of characters (alphabets) in increasing order from 'A' to 'E'
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.

			for (int j = 1; j <= 5; j++) { // Inner loop to print characters based on the condition for each row, '5' times.

				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print the character corresponding to ASCII code (64 + i).
					System.out.print((char)(64 + i));
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

		System.out.println("\n\n"); // Printing new lines for separation.

		// Third Part: Printing a pattern of characters (alphabets) in decreasing order from 'F' to 'A'
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print characters based on the condition for each row, '5' times.

				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print the character corresponding to ASCII code (70 - j).
					System.out.print((char)(70 - j));
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
