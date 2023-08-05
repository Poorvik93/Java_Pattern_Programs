import java.util.*;

public class Pattern47 {
	
	public static void main(String[] args) {
		// Printing a pattern of asterisks in a cross-like shape
		
		int k = 0; // Initializing a variable 'k' to keep track of the position of asterisks in each row.
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			if (i <= 3) { // If 'i' is less than or equal to 3, increment 'k'.
				k++;
			} else { // Otherwise, decrement 'k'.
				k--;
			}
			
			for (int j = 1; j <= 5; j++) { // Inner loop to print '*' or ' ', based on the condition for each row.
				if (j == k || j == 6 - k) { // If the value of 'j' is equal to 'k' or '6 - k', print an asterisk '*'.
					System.out.print("*");
				} else { // Otherwise, print a space ' '.
					System.out.print(" ");
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
