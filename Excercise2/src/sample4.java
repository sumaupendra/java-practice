import java.util.Scanner;
public class sample4 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,in,s;
		i=1;
		while(i<=n){
			System.out.println();
			s=1;
			while(s<=n-i){
				System.out.print(" ");
				s++;
			}
			in=1;
			while(in<=i){
				System.out.print(in);
				in++;
			}
			i++;
		}
		
	}

}
    