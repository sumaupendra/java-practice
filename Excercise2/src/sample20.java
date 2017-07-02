public class sample20 {
	public static void main(String[] suma){
		int a=1;
		for( ;a<=100;a++){
			if(a>40&&a<80)
				continue;
			System.out.println(a);
		}
	}

}
//o/p:
//	1
//	2
//	3
//	..
//	40...
//	80
//	81..
//	100