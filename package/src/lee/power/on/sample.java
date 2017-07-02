package lee.power.on;

public class sample {
   public static void main(String[] args) {
	final String r1="thelangana";
	final String r2="andhra";
	Thread t1=new Thread(){
		public void run(){
			synchronized(r1){
				String Name=getName();
				System.out.println(r1+"is reversed for"+Name);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Name+"now decision changed to"+r2);
				synchronized(r2){
					System.out.println(Name+"after reserved:"+r2);
				}
			}
		}
	
	};
	Thread t2=new Thread(){
		public void run(){
			synchronized(r2){
				String Name=getName();
				System.out.println(r2+"is reversed for"+Name);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Name+"now decision changed to"+r1);
				synchronized(r1){
					System.out.println(Name+"after reserved:"+r1);
				}
			}
		}
	
	};
	t1.setName("kcr");
	t2.setName("babu");
	t1.start();
	t2.start();
}
}
//o/p:
//thelanganais reversed forkcr
//andhrais reversed forbabu
//babunow decision changed tothelangana
//kcrnow decision changed toandhra