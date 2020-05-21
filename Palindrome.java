package java_week1;

public class Palindrome {

	public static void main(String[] args) {
		//Check for the palindrome of the given string:
		//	Input: "malayalam"
			//output: Yes, Palindrome
			//Input: "testleaf"
			//output: No, not a palindrome

		String input="malayalam";
		String rev="";
		int length=input.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
			
		}
	  if(input.equals(rev))
	  {
		  System.out.println("palindrome");
	  }
		
	  else
	  {
		  System.out.println("not a palindrome");
	  }
}
}
