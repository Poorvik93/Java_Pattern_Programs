import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		System.out.println("Enter the char which has to be print");
		char ch =sc.next().charAt(0);
//		// for printing the rows
//		for (int i=1;i<=n;i++) {
//			// for printing the character in each row
//			for (int j=1;j<=n;j++) {
//				System.out.print(ch);
//			}
//			//for sending the cursor to next line
//			System.out.println();
//
//		}
	
			// using while loop 
			/*int i=1;
			while(i<=n)
			{
				int j=1;
				while (j<=n)
				{
				System.out.print(ch);
				j++;
				}
				System.out.println();
				i++;
			}*/
		
		
		// using do while 
		int i=1 ;
		do {
			int j=1;
			do {
				System.out.println(ch);	
				j++;
			}
			while(j<=n);
			System.out.println();
			i++;
		}
		while(i<=n);
	}
	

}
