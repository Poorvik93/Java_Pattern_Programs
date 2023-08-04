import java.util.*;

public class Pattern45 {
	
	public static void main(String[] args) {
		// Printing a pattern of asterisks in a right-angled triangle
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 5; j++) { // Inner loop to print '*' or ' ', based on the condition for each row.
				if (i + j >= 6) { // If the sum of 'i' and 'j' is greater than or equal to 6, print an asterisk '*'.
					System.out.print("*");
				} else { // Otherwise, print a space ' '.
					System.out.print(" ");
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
