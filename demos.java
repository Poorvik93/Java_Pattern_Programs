import java.util.*;
public class demos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n value00");
            int n =sc.nextInt();
		int z=0;
		for(int i=1; i<=n; i++) {
			
			boolean is=true;
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					if(is && i%2==1 || is &&j%2==0) {
					System.out.print(i);
					is= false;
					}else {
						System.out.print((char)(64+i));
						is = true;
					}
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
