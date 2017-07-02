import java.util.Scanner;
public class sample9 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		 int i,in;
		 i=n;
		while(i>=1){
			System.out.println();
			in=1;
			while(in<=n-i+1){
				System.out.print(in);
				in++;
			}
			i--;
		}
	}
}
//o/p:1
//	  12
//	  123
//	  1234
//	  12345

