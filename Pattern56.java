import java.util.*;

public class Pattern56 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			for (int j = 1; j <= 6 - i; j++) { // Inner loop to iterate 'j' from 1 to 6-i (number of columns).
				System.out.print((6 - i) + " "); // Printing the value of (6 - i) followed by a space.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1 (number of rows).
			for (int j = 1; j <= i; j++) { // Inner loop to iterate 'j' from 1 to i (number of columns).
				System.out.print(i + " "); // Printing the value of 'i' followed by a space.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			for (int j = 1; j <= 6 - i; j++) { // Inner loop to iterate 'j' from 1 to 6-i (number of columns).
				System.out.print((6 - j) + " "); // Printing the value of (6 - j) followed by a space.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
