package DataStructures;

public class Rashmi {
	public static void main (String[] args)
	{
		String str="Rama is a boy";
		String str2=myFunction(str);
		System.out.println(str2);
	}

	private static String myFunction(String str) {
		if(str.isEmpty()) {
			return str;}
		String a=str.substring(1);
		String s= myFunction(str.substring(1))+str.charAt(0);
		return s;
	}

}
