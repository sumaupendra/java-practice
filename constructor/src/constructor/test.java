package constructor;

public class test{
static int s=11;
int x=10;
void show(){
	System.out.println("instance method");
}
public static void main(String suma[]){
	test t=new test();
	t.show();
	System.out.println(t.x);
	System.out.println(++s);
	System.out.println(++test.s);
	System.out.println(++t.s);
	void display(){
	 t.display();
}
static void main(){
	System.out.println("static method....");
}
}
