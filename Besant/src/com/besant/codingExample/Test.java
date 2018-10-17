package com.besant.codingExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefadf";
//first character should be capital letter
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				String s1 = s.charAt(0) + "";

				sb.append(s1.toUpperCase());

			} else {
				sb.append(s.charAt(i));
			}
		}

		System.out.println(sb);
		
		//how many repitition are there in the string
		
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int counter=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					counter++;
				}
				
			}
			
			System.out.println( c[i]+"exist "+counter+" times");
		}
	}

}
