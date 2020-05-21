import java.util.LinkedList;
import java.util.List;

public class RemoveDupList {

	public static void main(String[] args) {
		
//			How to remove duplicates from a list? 
//				List = "A,B,C,D,A,D,E,F"

		
		String input="ABCDADEF";
		//char[] charArray = input.toCharArray();
		List<Character> lis=new LinkedList<Character>();
		for(int i=0;i<input.length();i++)
		{
			if(!lis.contains(input.charAt((i)))) {
			
			lis.add(input.charAt(i));
			
			}
			else
			{
				System.out.print(input.charAt(i));
			}
	}
	}

	
	
	
	
}
