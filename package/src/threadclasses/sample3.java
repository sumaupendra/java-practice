package threadclasses;

public class sample3 {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t);
		System.out.println(Thread.currentThread());
	}

}
//o/p:
//	Thread[Thread-0,5,main]
//			Thread[main,5,main]