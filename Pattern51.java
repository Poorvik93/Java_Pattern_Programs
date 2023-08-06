import java.util.*;

public class Pattern51 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) { // Outer loop to iterate 'i' from 5 to 1 (number of rows).
			for (int j = 1; j <= 5; j++) { // Inner loop to iterate 'j' from 1 to 5 (number of columns).
				System.out.print(i + " "); // Printing the value of 'i' followed by a space.
			}
			System.out.println(); // Moving to the next line after each row is printed.
		}
	}
}
