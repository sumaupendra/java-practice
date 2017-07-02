package rose;

public class test {
public static void main(String[] args) {
	employee e=new employee();
//	e.empno=111;
	e.setEmpno(111);
	e.setName("suma");
	e.setSal(2500.33);
	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal());
}
}
