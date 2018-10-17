package mCQ;

public class Mixer3 {
	Mixer3()
	{
		
	}
	Mixer3(Mixer3 m)
	{
		m1=m;
	}
	Mixer3 m1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mixer3 m2=new Mixer3();
		Mixer3 m3=new Mixer3(m2);m3.go();
		Mixer3 m4=m3.m1;m4.go();
		Mixer3 m5=m2.m1;m5.go();
		final int i=10;
	}
	
	void go()
	{
		
		System.out.println("hi");
	}

}
