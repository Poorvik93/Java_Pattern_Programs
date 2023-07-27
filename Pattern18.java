import java.util.Scanner;

public class Pattern18 {

			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the value of n ");
				int n =sc.nextInt();
				// the variable where we start counting
				int count =1;
				//for the row
				for (int i=1;i<=n;i++) {
					//for column
					for (int j=1;j<=n;j++) 
					{
//..............................first method...............................
						//print the pattern
						System.out.print(count + " ");
						// increment the count 
						count++;
//'...................................,...............................
						
//..........................second method.....................
//.................if we write to visibility of first row num and all row num in same columns...............
//						if (count<=9) {
//							//print the pattern 
//							System.out.print(" " + count + " ");
//							// increment the count 
//							count++;
//						}
//						else {
//							//print the pattern
//							System.out.print(count + " ");
//							// increment the count 
//							count++;
//						}
//.............................................................................................

					}
					System.out.println(" ");
				}
	}

}
