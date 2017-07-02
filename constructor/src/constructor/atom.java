
class atom{
	int i=21;
	static int x=10;
	static void Show()
	System.out.println("atom static show");
	System.out.println(x);
	get static();
	//get instance();
	//System.out.println(i);
}
void display(){
	System.out.println("atom instance display");
	get instance();
	get static();
	System.out.println(i);
	System.out.println(x);
}
void get intsance(){
	
}