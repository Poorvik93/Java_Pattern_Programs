import java.util.*;

public class Pattern48 {
	
	public static void main(String[] args) {
		// Printing multiple patterns using nested loops and conditions
		
		// Pattern 1
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 9; j++) { // Inner loop to iterate 'j' from 1 to 9.
				if (j >= 6 - i && j <= 4 + i) { // Condition to determine where to print '*'.
					if (i % 2 == 0) { // If the row number 'i' is even, print '*' for even columns.
						if (j % 2 == 0) // If the column number 'j' is even, print '*'.
							System.out.print("*");
						else
							System.out.print(" "); // Otherwise, print a space ' '.
					} else { // If the row number 'i' is odd, print '*' for odd columns.
						if (j % 2 == 1) // If the column number 'j' is odd, print '*'.
							System.out.print("*");
						else
							System.out.print(" "); // Otherwise, print a space ' '.
					}
				} else {
					System.out.print(" "); // If not within the range, print a space ' '.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
		
		// Pattern 2 (Half Pyramid of Asterisks)
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 5; j++) { // Inner loop to iterate 'j' from 1 to 5.
				if (j >= 6 - i) { // Condition to determine where to print '*'.
					System.out.print("*"); // Printing '*'.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
		
		// Pattern 3 (Alternate Pyramid of Asterisks)
		int k;
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			k = 1;
			for (int j = 1; j <= 9; j++) { // Inner loop to iterate 'j' from 1 to 9.
				if (j >= 6 - i && j <= 4 + i && k == 1) { // Condition to determine where to print '*'.
					System.out.print("*"); // Printing '*'.
					k = 0; // Toggling 'k' to print alternate '*' in each row.
				} else {
					System.out.print(" "); // If not within the range, print a space ' '.
					k = 1; // Toggling 'k' to print alternate spaces in each row.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
