import java.util.*; // Importing all classes from the java.util package.

public class Pattern28 { // Declaring a public class named "Pattern27".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// First Part: Printing the upper half of the diamond pattern
		for (int i = 1; i <= 7; i++) { // Outer loop to iterate 'i' from 1 to 7.

			for (int j = 1; j <= 7; j++) { // Inner loop to print '*' or ' ' based on the condition for each row, '7' times.
				// If condition to determine whether to print '*' or ' ' based on the position of 'i' and 'j'.
				if ((i <= 4 && j >= 5 - i && j <= 3 + i) || (i >= 4 && j >= i - 3 && j <= 11 - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Second Part: Printing the lower half of the diamond pattern
		int k = 0; // Initializing variable 'k' to track the number of '*' to be printed in each row.
		for (int i = 1; i <= 7; i++) { // Outer loop to iterate 'i' from 1 to 7.

			if (i <= 4) {
				k++; // Increment 'k' if 'i' is less than or equal to 4.
			} else {
				k--; // Decrement 'k' if 'i' is greater than 4.
			}

			for (int j = 1; j <= 7; j++) { // Inner loop to print '*' or ' ' based on the condition for each row, '7' times.
				// If condition to determine whether to print '*' or ' ' based on the position of 'i' and 'j'.
				if (j >= 5 - k && j <= 3 + k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
