import java.util.Scanner;
public class sample2 {
public static void main(String[] suma){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	int i,in;
	i=1;
	while(i<=n){
		System.out.println();
		in=1;
		while(in<=i){
			System.out.print(in);
			in++;
		}
		i++;
	}
	
	
}
}
