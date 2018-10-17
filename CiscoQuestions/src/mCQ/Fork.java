package mCQ;

public class Fork {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1|args[1].equals("test"))
		{
			System.out.println("test case");
		}
		else
		{
			System.out.println("Production "+args);
		}
	}

}
