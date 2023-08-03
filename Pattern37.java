import java.util.*;
public class Pattern37 { // Declaring a public class named "Pattern9".

	public static void main(String[] args) { // The entry point of the program, the main method.

		// Printing a pattern of characters (alphabets) in reverse order from 'E' to 'A'
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.

			for (int j = 5; j >= 1; j--) { // Inner loop to print characters based on the condition for each row, '5' times.

				// Print the characters corresponding to ASCII codes (64+i) followed by a space ' '.
				// ASCII code 65 represents 'A', 66 represents 'B', and so on.
				System.out.print((char)(64 + i) + " ");
			}

			System.out.println(); // Moving to the next line after each row is printed.
		}

//		for (int i = 1; i <= 5; i++) { // Code commented out for the second part of the program.

//			for (int j = 1; j <= 5; j++) { // Code commented out for the second part of the program.
//				System.out.print((char)(64 + i) + " "); // Code commented out for the second part of the program.
//			} // Code commented out for the second part of the program.
//			System.out.println(); // Code commented out for the second part of the program.
//		} // Code commented out for the second part of the program.
	}
}
