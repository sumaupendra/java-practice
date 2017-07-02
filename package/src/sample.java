
public class sample {
	public static void main(String[] args) {
		int odd[]=new int[10];
		int even[]=new int[10];
		int i,a=1,b=-1,sumo=0,sume=0;
		for(i=1;i<=20;i++)
		{
			if(1%2==0)
				even[++a]=i;
			else
				odd[++b]=i;
		}
		for(i=0;i<10;i++){
			System.out.println(odd[i]+"\t"+even[i]);
			sumo+=odd[i];
			sume+=even[i];
		}
		System.out.print("sumo:"+sumo);
		System.out.println("sume:"+sume);
	}

}
