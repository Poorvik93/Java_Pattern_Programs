import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		int x=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<i+1;j++)
			{
				System.out.print(x++ + " ");
			}
			System.out.println(" ");
			
		
		}
		
		// without user input
//		int x=1;
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<i+1;j++)
//			{
//				System.out.print(x++ + " ");
//			}
//			System.out.println(" ");
//		}
	}
}
