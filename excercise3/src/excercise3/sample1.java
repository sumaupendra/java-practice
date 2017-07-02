public class sample1{
	int s;
	void show(){
		System.out.println("rose show method");
	}
	public static void main(String[] args){
		sample1 r =new sample1();
		r=show();
		System.out.println(++r.s);
		
	}
	

}
