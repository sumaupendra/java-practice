import java.util.Scanner;

public class test {
public static void main(String[] args) {
//	final int m=10;
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int m=sc.nextInt();
//	int ar[]=new int[m];
	double ar[]=new double[m];
	System.out.printf("enter %d elements",m);
	for(i=0;i<ar.length;i++)
		ar[i]=sc.nextDouble();
	System.out.println("display the elements:");
	for(i=0;i<ar.length;i++)
		System.out.printf("\n ar[%D]=%10.2f",i,ar[i]);
	double tot=0;
	for(i=0;i<ar.length;i++)
		tot+=ar[i];
	System.out.println("\n total is "+tot);
	System.out.println("average is"+tot/m);
}
}
