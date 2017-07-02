import java.util.Scanner;
public class sample7 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,in;
		i=n;
		while(i>=1){
			System.out.println();
			in=1;
			while(in<=i){
				System.out.print(in);
				in++;
			}
			i--;
		}
	}
}
