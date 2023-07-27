import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		//for the row
		for (int i=1;i<=n;i++)
		{
			//for column
			for (int j=1;j<=i;j++)
			{
				//print the pattern
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
