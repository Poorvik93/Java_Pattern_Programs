import java.util.Scanner;

public class Pattern22 {

			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the value of n ");
				int n =sc.nextInt();
				// the variable where we start counting
				int count =1;
				//for the row
				for (int i=1;i<=n;i++)
				{
					//for column
					for (int j=1;j<=n;j++)
					{
						//print the pattern
						System.out.printf("%02d ", count);
						// increment the count 
						count++;
					}
					System.out.println(" ");
				}
	}

}
