package lee.power.on;

public class test1 {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String ("sachin");
		System.out.println("==operator");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("equals() method");
		System.out.println(s1.equals(s3));
		int n=s1.compareTo(s3);
		System.out.println("compare:"+n);
		String s4="rocket";
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));
	}

}
//true
//false
//equals()method
//true 
//compare:0
//1
//-1