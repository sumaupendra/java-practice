//using do while
import java.util.Scanner;
public class sample12 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,in;
		i=1;
		do{
			in=1;
			while(in<=i){
				System.out.print(in);
				in++;
			}
			System.out.println();
			i++;
		}
		while(i<=n);
	}
}
//o/p:1
//    12
//    123
//    1234
//    12345