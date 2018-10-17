package mCQ;

public class Bertha {

	static String s="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;Boolean y=true;
		Short[] sa= {1,2,3};
		doStuff(x,y);
		doStuff(x);
		doStuff(sa,sa);
		System.out.println(s);
	}

	
	static void doStuff(Object o)
	{
		s+="1";
	}
	static void doStuff(Object... o)
	{
		s+="2";
	}
	static void doStuff(Integer... o)
	{
		s+="3";
	}
	static void doStuff(Long l)
	{
		s+="4";
	}
}
