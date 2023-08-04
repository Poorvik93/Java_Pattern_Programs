import java.util.*;

public class Pattern44 {
	
	public static void main(String[] args) {
		// Printing a pattern of numbers in a right-angled triangle
		
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5.
			for (int j = 0; j < i; j++) { // Inner loop to print 'i' for 'i' number of times.
				System.out.print(i + " "); // Print 'i' followed by a space ' '.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
