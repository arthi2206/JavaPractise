import java.util.LinkedHashSet;
import java.util.Set;

public class DupCharsCollections_set {

	public static void main(String[] args) {
//		1. Write a java program to print the duplicate character using Collections Framework.
//		Input: "When life gives you lemons, make lemonade"
	
		Set <Character> instring = new LinkedHashSet<Character>();
		String input="When life gives you lemons, make lemonade";
		//char[] charArray = input.toCharArray();
		for(int i=0;i<input.length();i++)
		{boolean add = instring.add(input.charAt(i));
		//System.out.println(instring);
			if(!add)
						{
				System.out.print(input.charAt(i)+",");
			}
			
		}
	}


	

	

}
