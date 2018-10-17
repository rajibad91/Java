package mCQ;

import java.util.*;

public class MapEQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<ToDos,String> map=new HashMap<ToDos, String>();
		ToDos t1=new ToDos("Monday");
		ToDos t2=new ToDos("Monday");
		ToDos t3=new ToDos("Tuesday");
		map.put(t1, "DoLaundry");
		map.put(t2, "PayBills");
		map.put(t3, "CleanAttire");
		System.out.println(map.size());
		System.out.println(map);
	}

}

class ToDos
{
	String day;
	ToDos(String d)
	{
		day=d;
	}
	
	public boolean equals(Object o)
	{
		return ((ToDos)o).day==this.day;
	}
	
//	public int hashCode()
//	{
//		return 9;
//	}
}
