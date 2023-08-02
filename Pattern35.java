import java.util.*; // Importing all classes from the java.util package.

public class Pattern35 { // Declaring a public class named "Pattern35".

	public static void main(String[] args) { // The entry point of the program, the main method.

		for (int i = 0; i < 5; i++) { // Outer loop to iterate 'i' from 0 to 4.

			for (int j = 5; j >= 1; j--) { // Inner loop to print characters based on the condition for each row, '5' times.

				// Print the characters corresponding to ASCII codes (64+j) followed by a space ' '.
				// ASCII code 65 represents 'A', 66 represents 'B', and so on.
				System.out.print((char)(64 + j) + " ");
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
