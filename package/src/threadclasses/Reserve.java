package threadclasses;

public class Reserve implements Runnable {
int a=1;
int w;
public Reserve(int w){
	this.w=w;
}
public void run(){
	synchronized(this){
	String name=Thread.currentThread().getName();
	if(a>w){
		System.out.println(w+"is reserve for:"+name);
		try{
		Thread.sleep(500);
		}catch(InterruptedException e){}
		a=a-w;
	}
	else
		System.out.println("sorry no seats for"+name);
}
}
}
//o/p;
//0is reserve for:suma
//0is reserve for:reddy
//0is reserve for:sama
