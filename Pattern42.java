import java.util.*;

public class Pattern42 {
	
	public static void main(String[] args) {
		// Printing a pattern of numbers in a right-angled triangle
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 1; j <= 6 - i; j++) { // Inner loop to print 'j' followed by a space ' ', based on the condition for each row.
				System.out.print(j + " "); // Print 'j' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
