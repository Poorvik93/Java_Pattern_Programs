import java.util.*;

public class Pattern43 {
	
	public static void main(String[] args) {
		// Printing a pattern of asterisks in a diamond-like shape
		
		int k = 0; // Initializing a variable 'k' to keep track of the number of asterisks in each row.
		
		for (int i = 1; i <= 9; i++) { // Outer loop to iterate 'i' from 1 to 9.
			if (i <= 5) { // If 'i' is less than or equal to 5, increment 'k'.
				k++;
			} else { // Otherwise, decrement 'k'.
				k--;
			}
			
			for (int j = 1; j <= 9; j++) { // Inner loop to print '*' or ' ', based on the condition for each row.
				if (j >= k && j <= 10 - k) { // If the value of 'j' is within the range of 'k' and '10 - k', print an asterisk '*'.
					System.out.print("*");
				} else { // Otherwise, print a space ' '.
					System.out.print(" ");
				}
			}
			System.out.println(""); // Moving to the next line after each row is printed.
		}
	}
}
