import java.util.Scanner;
public class sample10 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		 int i,in;
		 char ch='A';
//		 char ch='a';
//		 int ch=1;
		 i=n;
		 while(i>=1){
			 System.out.println();
			 in=1;
			 while(in<=n-i+1){
				 System.out.printf("%3c",ch++);
//				 System.out.printf("%3d",ch++);
				 in++;
			 }
			 i--;
		 }
	}
}
//o/p:A
//	  B C
//	  D E F
//	  G H I J
//	  K L M N O
