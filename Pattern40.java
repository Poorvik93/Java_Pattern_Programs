import java.util.*;

public class Pattern40 {
	
	public static void main(String[] args) {
		// Printing a pattern of numbers in a right-angled triangle
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 5; j++) { // Inner loop to print numbers based on the condition for each row, '5' times.
				if (j >= i) { // If the value of 'j' is greater than or equal to 'i', print the value of 'j'.
					System.out.print(j);
				} else {
					System.out.print(" "); // If the value of 'j' is less than 'i', print a space ' '.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
