import java.util.Scanner;
public class sample1 {
	public static void main(String[] suma){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice operator");
		String ch=sc.nextLine();
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=0;
	switch(ch){
	case 'Add';
	case"+";
	System.out.println("addtion:");
	r=a+b;
	break;
	case "sub";
	case"-";
	System.out.println("subtraction:");
	r=a-b;
	break;
	case "mul";
	case"*";
	System.out.println("multipiclation:");
	r=a*b;
	break;
	case "div";
	case "/";
	System.out.println("division:");
	r=a/b;
	break;
	case "rem";
	case "%";
	System.out.println("remainder:");
	r=a%b;
	break;
	default:
		System.out.println("invalid operator");
		}
	System.out.println("result:"+r);
	}

}
