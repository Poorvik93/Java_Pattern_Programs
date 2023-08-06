import java.util.*;

public class Pattern57 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			for (int j = 1; j <= 5; j++) { // Inner loop to iterate 'j' from 1 to 5 (number of columns).
				if (j >= i) { // Condition to print '*' when 'j' is greater than or equal to 'i'.
					System.out.print("*");
				} else {
					System.out.print(" "); // If 'j' is less than 'i', print a space.
				}
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) { // Outer loop to iterate 'i' from 1 to 5 (number of rows).
			for (int j = i; j <= 5; j++) { // Inner loop to iterate 'j' from 'i' to 5 (number of columns).
				System.out.print(j); // Printing the value of 'j' in increasing order from 'i' to 5.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
