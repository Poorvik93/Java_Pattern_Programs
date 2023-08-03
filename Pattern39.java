import java.util.*;

public class Pattern39 {
	
	public static void main(String[] args) {
		// Printing a pattern of numbers in a pyramid-like structure
		
		// First Part: Printing numbers in decreasing order from '1' to '5'
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 0; j < 6 - i; j++) { // Inner loop to print 'i' followed by a space ' ', based on the condition for each row.
				System.out.print(i + " "); // Print 'i' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		// Second Part: Printing numbers in increasing order from '1' to '5'
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1.
			for (int j = 1; j <= i; j++) { // Inner loop to print '6 - i' followed by a space ' ', based on the condition for each row.
				System.out.print(6 - i + " "); // Print '6 - i' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
