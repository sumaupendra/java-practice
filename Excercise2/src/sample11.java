import java.util.Scanner;
public class sample11 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i;
		i=0;
//		i=1;(enter add values)
		do{
			i+=2;
			System.out.println(i);
		}
		while(i<20);
		{
			System.out.println("rest of the main");
		}
	}
}
//o/p:2
//	4
//	6
//	8
//	10
//	12
//	14
//	16
//	18
//	20