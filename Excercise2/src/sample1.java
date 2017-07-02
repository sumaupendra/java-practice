import java.util.Scanner;

public class sample1 {
public static void main (String[] suma){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n =sc.nextInt();
	int sd,rn,nd;
	sd=rn=nd=0;
//	while(n!=0)	{
//		sd=sd+n%10;
//		rn=rn*10+n%10;
//		nd++;
//		n=n/10;
//		}
	
//	int i;
//	i=10;
//	while(i>1){
//		System.out.println(i);
//		i--;
//	}
	
	while(n>0){
		sd= sd+ n%10;
		rn = rn*10 + n % 10;
		nd++;
		n = n/10;
		System.out.println(sd );
	}
	System.out.println("sum of digits :"+sd);
	System.out.println("reverse no:"+rn);
	System.out.println("no of digits"+nd);
	
	
//	System.out.println(5 + 425 % 10);

}
}
