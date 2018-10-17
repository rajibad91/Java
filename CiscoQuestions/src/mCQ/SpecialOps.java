package mCQ;

public class SpecialOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="";
		Boolean b1=true;
		Boolean b2=false;
		
		if(b2=false)s+="x";
		if(b1||(b2=true))s+="y";
		if(b2==true)s+="z";
		System.out.println(s);
	}

}
