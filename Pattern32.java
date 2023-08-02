import java.util.*; // Importing all classes from the java.util package.

public class Pattern32 { // Declaring a public class named "Pattern32".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// First Part: Printing a left-aligned right-angled triangle with characters from 'A' to 'E'
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print characters or spaces based on the condition for each row, '5' times.

				if (j <= i) { // If the value of 'j' is less than or equal to 'i', print the character corresponding to ASCII code (64+j).
					System.out.print((char) (64 + j));
				} else {
					System.out.print(" "); // If the value of 'j' is greater than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Second Part: Printing a right-aligned right-angled triangle with '*' and spaces
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.

			for (int j = 1; j <= 5; j++) { // Inner loop to print '*' or spaces based on the condition for each row, '5' times.

				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print '*'.
					System.out.print("*");
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
		
		// Third Part: Printing a left-aligned right-angled triangle with numbers from 1 to 5
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print the value of 'i' or a space ' ' based on the condition for each row, '5' times.

				if (j <= i) { // If the value of 'j' is less than or equal to 'i', print the value of 'i'.
					System.out.print(i);
				} else {
					System.out.print(" "); // If the value of 'j' is greater than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
