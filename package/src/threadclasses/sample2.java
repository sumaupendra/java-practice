package threadclasses;

public class sample2 {
	public static void main(String[] args) {
		car c=new car();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		t1.setName("sama");
		t2.setName("suma");
		t3.setName("reddy");
		t2.start();
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
			t1.start();
			t3.start();
			
	}
}
