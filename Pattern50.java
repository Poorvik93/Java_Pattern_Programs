import java.util.*;

public class Pattern50 {
	public static void main(String[] args) {
		int k = 1; // Initializing a variable 'k' to keep track of the pattern value (1 or 0).
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			for (int j = 1; j <= 5; j++) { // Inner loop to iterate 'j' from 1 to 5 (number of columns).
				if (j <= i) { // If 'j' is less than or equal to 'i',
					if ((i + j) % 2 == 0) { // check if the sum of 'i' and 'j' is even,
						System.out.print("1"); // print '1' if the sum is even.
					} else {
						System.out.print("0"); // Otherwise, print '0' if the sum is odd.
					}
				} else {
					System.out.print(" "); // If 'j' is greater than 'i', print a space ' '.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
