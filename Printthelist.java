import java.util.LinkedList;
import java.util.List;

public class Printthelist {

	public static void main(String[] args) {
	//	 Write a java program to print the list 
	//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

		String input="Bugatti Chiron";
		List<Character> lis=new LinkedList<Character>();
		for(int i=0;i<input.length();i++)
		{
			lis.add(input.charAt(i));
}
		if(lis.size()!=0)
		{System.out.println(lis);
}
}
}
