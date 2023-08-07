import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row and columans");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] a =new int[row][col];
		for(int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a.length-1;j++)
			{
				System.out.println(" enter the row "+(i+1)+ " column is"+(j+1) );
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				if(i== 0 || i==a.length-1 || j==0 ||j==a[i].length-1)
				{
					System.out.print(" "+a[i][j]);
				}
				else 
				{
					System.out.print(" " +" " +" ");
				}
			}
			System.out.println();
		}
	}
}

