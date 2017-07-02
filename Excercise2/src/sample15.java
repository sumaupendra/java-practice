import java.util.Scanner;
public class sample15 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,in,s,dn;
		for(i=1;i<=n;i++){
			System.out.println();
			for(s=1;s<=n-i;s++)
				System.out.print("  ");
		    for(in=1;in<=i;in++)
		    	System.out.print(in);
		    for(dn=i-1;dn>=1;dn--)
		    	System.out.print(dn);
		}
		for(i=1;i>=n;i--){
			System.out.println();
		for(s=1;s<=n-i;s--)
				System.out.print("  ");
	    for(in=1;in<=i;in--)
		    	System.out.print(in);
		    for(dn=i-1;dn>=1;dn++)		    	
		        System.out.print(dn);
		}
	}
}
