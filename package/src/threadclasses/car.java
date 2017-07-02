package threadclasses;

public class car implements Runnable{
	public void run(){
		System.out.println("car is running");
		for(int i=1;i<=10;i++){
			String name=Thread.currentThread().getName();
			System.out.println(Thread.currentThread().getId()+"\t");
			System.out.println(name+"-->"+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}
