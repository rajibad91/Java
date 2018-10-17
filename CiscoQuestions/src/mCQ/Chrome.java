package mCQ;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x1=new X();
		X x2=new Y();
		Y y1=new Y();
		((Y)x2).d2();
	}

}

class X {
	void d1()
	{
		
	}
}

class Y extends X
{
	void d2()
	{
		
	}
}