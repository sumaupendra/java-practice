import java.util.Scanner;

/**
 * 
 */

/**
 * @author Suma
 *
 */
public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i,in,s,dn;
		i=1;
		while(i<=n){
			System.out.println();
			in=1;
				while(in<=i){
					System.out.print(in);
					in++;
				}
				s=2*(n-i);
				while(s>=1){
					System.out.print(" ");
					s=s-1;
				}
				System.out.print(" ");
				dn=i;
				while(dn>=1){
					System.out.print(dn);
					dn--;
				}
				i++;
		}
	}

}
//1        1
//12      21
//123    321
//1234  4321
//1234554321
