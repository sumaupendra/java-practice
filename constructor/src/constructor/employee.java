package constructor;
public class employee {
	int empno;
	String name;
	double sal;
	employee(int no,String n,double s){
		empno=no;
		name=n;
		sal=s;
	}
    void display(){
    	System.out.print(empno+"\t"+name+"\t"+sal);
    }
}
class test{
	public static void main(String args){
		employee e1=new employee(111,"sama",3500);
		employee e2=new employee(222,"suma",4500);
		e1.display();
		e2.display();
	}
}
