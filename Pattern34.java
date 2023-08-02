import java.util.*; // Importing all classes from the java.util package.

public class Pattern34 { // Declaring a public class named "Pattern34".

	public static void main(String[] args) { // The entry point of the program, the main method.

		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 9; j++) { // Inner loop to print '*' or spaces ' ' based on the condition for each row, '9' times.

				if (j <= 6 - i || j >= 4 + i) { // If the value of 'j' is less than or equal to (6 - i) or greater than or equal to (4 + i), print '*'.
					System.out.print("*");
				} else {
					System.out.print(" "); // If the value of 'j' is between (6 - i) and (4 + i), print a space ' '.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
