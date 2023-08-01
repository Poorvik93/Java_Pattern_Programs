import java.util.*; // Importing all classes from the java.util package.

public class Pattern29 { // Declaring a public class named "Pattern29".

	public static void main(String[] args) { // The entry point of the program, the main method.

		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print 'i' or a space ' ' based on the condition for each row, '5' times.

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
