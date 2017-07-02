package constructor;
//constructor over loading
public class sample3 {
	public sample3(){
		System.out.println("default constructor");
	}
   public sample3(String name){
	   System.out.println("one args name:"+name);
   }
   public sample3(String name,String course,double fee){
	   System.out.println("three args");
	   System.out.println(name+"\t"+course);
	   System.out.println("fee:"+fee);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new sample3("suma","java complete",8000);
	}

}
