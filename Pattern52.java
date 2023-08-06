import java.util.*;

public class Pattern52 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { // Outer loop to iterate 'i' from 0 to 4 (number of rows).
			for (int j = 1; j <= 5; j++) { // Inner loop to iterate 'j' from 1 to 5 (number of columns).
				System.out.print((char)(64 + j) + " "); // Printing the character corresponding to ASCII value (A, B, C, D, E) followed by a space.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
