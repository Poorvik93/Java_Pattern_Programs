import java.util.*; // Importing all classes from the java.util package.

public class Pattern31 { // Declaring a public class named "Pattern31".

	public static void main(String[] args) { // The entry point of the program, the main method.

		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.

			for (int j = 1; j <= 5; j++) { // Inner loop to print the value of 'i' followed by a space ' ' for each row, '5' times.
				System.out.print(i + " ");
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
