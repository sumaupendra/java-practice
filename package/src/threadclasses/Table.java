package threadclasses;

public class Table {
public void print(int n){
//	public void synchronized print(int n){
	for(int i=1;i<=10;i++){
		System.out.println(i*n);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
}
}