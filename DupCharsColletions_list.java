import java.util.LinkedList;
import java.util.List;

public class DupCharsColletions_list {

	public static void main(String[] args) {
//		1. Write a java program to print the duplicate character using Collections Framework.
//		Input: "When life gives you lemons, make lemonade"
		
		String input="When life gives you lemons, make lemonade";
		List<Character> list=new LinkedList<Character>();
		for(int i=0;i<input.length();i++)
		{
					
			if(!list.contains(input.charAt(i)))
			{
				list.add(input.charAt(i));
			}
			else {
				
			System.out.print(input.charAt(i)+",");	
			}
		}
	}

}
