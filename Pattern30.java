import java.util.*; // Importing all classes from the java.util package.

public class Pattern30 { // Declaring a public class named "Pattern30".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// First Part: Printing a left-aligned right-angled triangle with numbers increasing from 1 to 5
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 6 - i; j++) { // Inner loop to print 'j' for each row, with decreasing count as 'i' increases.
				System.out.print(j);
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

		System.out.println(); // Adding multiple empty lines to separate the patterns.
		System.out.println();
		System.out.println();

		// Second Part: Printing a right-aligned right-angled triangle with numbers from 1 to 5 and spaces
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print the value of 'i' or a space ' ' based on the condition for each row, '5' times.

				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print the value of 'i'.
					System.out.print(i);
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
