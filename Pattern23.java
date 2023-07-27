import java.util.Scanner;

public class Pattern23 
{

			public static void main(String[] args)
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the value of n ");
				int n =sc.nextInt();
				// the variable where we start counting
				int evencount =2;
				int oddcount=1;
				//for the evencount rows
				for (int i=1;i<=n/2;i++)
				{
					//for the evencount column
					for (int j=1;j<=n;j++)
					{
						//condition for the printing 0 with single digit number
						if (evencount<=9) {
							// printing the even count
							System.out.print("0" + evencount + " ");
							//increment the value with 2 every time
							evencount+=2;
						}
						//condition for the printing nonzero number
						 else if(evencount>9) {
							// printing the even count
							System.out.print(evencount + " ");
							//increment the value with 2 every time
							evencount+=2;
						}
					}	
					System.out.println();
				}
				//for the oddcount rows
					for (int i=1;i<=n/2;i++)
					{
						//for the oddcount column

						for (int j=1;j<=n;j++)
						{
							//condition for the printing 0 with single digit number
							if (oddcount<=9) {
								// printing the odd count
								System.out.print("0" + oddcount + " ");
								//increment the value with 2 every time
								oddcount+=2;
							}
							//condition for the printing nonzero number
							 else if(oddcount>9) {
								System.out.print(oddcount + " ");
								//increment the value with 2 every time
								oddcount+=2;
							}
						}					
					System.out.println();
					}
			}
	

}
			
