package Demo;

public class Trial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer Cobj=new Customer();
		Cobj.id=101;
		Cobj.name="Soumya";
		
		Customer Cobj1=Cobj;
		Cobj1.name="Papoon";
		System.out.println(Cobj1.name+"  "+Cobj.name);
		Cobj.main();

	}

}

class Customer
{
	int c1=10;
	int c2=c1;
	
	int id;
	String name ;
	public  void main()
	{
	System.out.println(c2);
	}
	
	
}