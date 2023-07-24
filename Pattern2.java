import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		System.out.println("Enter the char which has to be print");
		char ch =sc.next().charAt(0);
		
		// using for loop
		/*for (int i=1;i<=n;i++) {
			System.out.println(ch);
		}*/
		
		//using while loop
		/*	int i=1;
		while(i<=n) {
			System.out.println(ch);
			i++;
		}
		*/
		
		// using Do-while loop
		int i=1;
		do {
			System.out.println(ch);
			i++;
		}
		while(i<=n);
	}
}
