import java.util.*;
public class Pattern41 { // Declaring a public class named "Pattern11".

	public static void main(String[] args) { // The entry point of the program, the main method.
		
		// First Part: Printing a pattern of asterisks in a right-angled triangle with decreasing rows
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 0; j < 6 - i; j++) { // Inner loop to print '*' followed by a space ' ', based on the condition for each row.
				System.out.print("*" + " "); // Print '*' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
		
		System.out.println(); // Printing new lines for separation.
		System.out.println(); // Printing new lines for separation.
		
		// Second Part: Printing a pattern of asterisks in a right-angled triangle with increasing rows
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 5; j++) { // Inner loop to print '*' followed by a space ' ', based on the condition for each row.
				if (i + j <= 6) { // If the sum of 'i' and 'j' is less than or equal to 6, print '*' followed by a space ' '.
					System.out.print("*" + " ");
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
		
		System.out.println(); // Printing new lines for separation.
		System.out.println(); // Printing new lines for separation.
		
		// Third Part: Printing a pattern of asterisks in a right-angled triangle with decreasing rows
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.
			for (int j = 1; j <= i; j++) { // Inner loop to print '*' followed by a space ' ', based on the condition for each row.
				System.out.print("*" + " "); // Print '*' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
