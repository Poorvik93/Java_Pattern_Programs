import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		System.out.println("Enter the char which has to be print");
		char ch =sc.next().charAt(0);
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(ch);
			}
				System.out.println( );
		}
	}

}



