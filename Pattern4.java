import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of rows ");
		int row =sc.nextInt();
		System.out.println("Enter the value of column ");
		int column =sc.nextInt();
		System.out.println("Enter the char which has to be print");
		char ch =sc.next().charAt(0);
		
//		// for printing the rows 
//		for(int i =1;i<=row;i++) {
//			// for printing the columns 
//			for (int j=1;j<=column;j++) {
//				System.out.print(ch);
//			}
//			// for printing the value to next line
//			System.out.println();
//		}
		
			//.............printing in while-loop....................
//			int i=1;
//			while(i<=row) {
//				int j=1;
//				while (j<=column) {
//					System.out.print(ch);
//					j++;
//				}
//				System.out.println();
//				i++;
//			}
		
		//...............printing in the do-while loop..............
		
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(ch);
				j++;
			}
			while(j<=column);
			System.out.println();
			i++;
		}
		while(i<=row);
	}

}
