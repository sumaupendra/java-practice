package threadclasses;

public class sample {
	public static void main(String[] args) {
		Reserve r=new Reserve(0);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		t1.setName("sama");
		t2.setName("suma");
		t3.setName("reddy");
		t2.start();
		t1.start();
		t3.start();
	}

}
//o/p;
//0is reserve for:suma
//0is reserve for:reddy
//0is reserve for:sama

