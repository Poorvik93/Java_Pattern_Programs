import java.util.*; // Importing all classes from the java.util package.

public class Pattern27 { // Declaring a public class named "Pattern27".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// Pattern from top to bottom:
		for (int i = 0; i < 5; i++) { // Outer loop to iterate 'i' from 0 to 4.

			for (int j = 5; j >= 1; j--) { // Inner loop to print 'j' followed by a space ' ' for each row, '5' times.
				System.out.print(j + " ");
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
