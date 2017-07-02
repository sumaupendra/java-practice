package threadclasses;

public class table1 {
public static void main(String[] args) {
	final Table t=new Table();
	Thread t1=new Thread(){
		public void run(){
			t.print(5);
		}
	};
	Thread t2=new Thread(){
		public void run(){
			t.print(7);
		}
	};
	t1.start();
	t2.start();
}
}
