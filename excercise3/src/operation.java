
public class operation {
	static final double PI=3.14;
	void area(){
		System.out.println("default area");
	}
	void Area(int x){
		System.out.println("area of squre"+(x*x));
	}
	void area(double r){
		System.out.println("area of circle:");
		r=PI*r*r;
		System.out.println(r);
	}
	void area(int x,int y){
		System.out.println("area of rect:");
		System.out.println(x*y);
	}
	void area (double b,double h){
		System.out.println("area of traingle:");
		System.out.println(0-5*b*h);
	}
}
