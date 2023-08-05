import java.util.*;

public class Pattern49 {
	
	public static void main(String[] args) {
		// Printing a pattern in the shape of a pyramid using nested loops and conditions
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			int k = 0; // Initializing a variable 'k' to keep track of the position of '*' and ' ' in each row.
			for (int j = 1; j <= 9; j++) { // Inner loop to iterate 'j' from 1 to 9 (number of columns).
				if (j <= 5) // If 'j' is less than or equal to 5, increment 'k'.
					k++;
				else // Otherwise, decrement 'k'.
					k--;
				if (k <= 6 - i) // If 'k' is less than or equal to the difference between 6 and 'i',
					System.out.print("*"); // print an asterisk '*'.
				else
					System.out.print(" "); // Otherwise, print a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
