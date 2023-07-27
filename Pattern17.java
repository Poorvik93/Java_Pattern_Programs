import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		//for the row values 
		for (int i=1;i<=n;i++)
		{
			//for the row values 
			for (int j=1;j<=n;j++)
			{
				// printing the pattern only increment the j=column value
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}

	}
}
