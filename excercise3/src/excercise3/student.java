package excercise3;

public class student {
	int sno;
	String name;
	double marks;
	void show(){
		System.out.println(sno +"\t"+name +"\t"+marks);
	}

}
class test {
	public static void main(String[] suma){
		student s1,s2,s3;
		s1=new student();
		s1.show();
		s2=new student();
		s2.sno=111; s2=name"suma";s2.marks=99.44;
		s3=new student();
		s3.sno=222;s3=name "reddy";s3.marks=99.66;
		student s4=new student();
		s4.sno=333;s4=name "sama";s4.marks=99.99;
		s4.show();
		new student().show();
		
	}
}