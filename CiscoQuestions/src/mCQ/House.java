package mCQ;

public class House {
	
	House()
	{
		System.out.println("b");
	}
	
	House(String s)
	{
		this();
		System.out.println("bn"+s);
	}
	
	static public void main(String[] args)
	{
		new Building("X");
	}

}

  class Building extends House
{
	  Building()
	  {
		  System.out.println("h");
	  }
	  Building(String s)
	  {
		  this();
		  System.out.println("hn"+s);
	  }
}
