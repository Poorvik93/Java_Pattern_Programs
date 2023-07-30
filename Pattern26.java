import java.util.*; // Importing all classes from the java.util package.

public class Pattern26 { // Declaring a public class named "Pattern26".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// Pattern from top to bottom:
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.

			for (int j = 1; j <= 5; j++) { // Inner loop to print the character corresponding to ASCII code (64+i) for each row, '5' times.
				System.out.print((char) (64 + i)); // The expression (char)(64+i) converts the ASCII value to the corresponding character.

			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Pattern from bottom to top:
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print '*' followed by a space ' ' for each row, '5' times.

				if (j <= i) // If the value of 'j' is less than or equal to 'i', print '*'.
					System.out.print("*");
				else
					System.out.print(" "); // If the value of 'j' is greater than 'i', print a space ' '.

			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
