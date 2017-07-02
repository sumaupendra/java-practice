import java.util.Scanner;
public class sample2 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char ch=sc.nextLine().charAt(0);
		if(ch>='A'&&ch<='Z')
		//(ch.='a'&&ch<='z')
			switch(ch){
			case 'a':
			case'e':
			case'i':
			case'o':
			case'u':
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				System.out.println("vowel");
				break;
				default:
					System.out.println("consonant");
			}
		else
			System.out.println("other char");
	}
}
