package java_week1;

public class ReverseEvenWordofString {

	public static void main(String[] args) {
//		2. Write a java program to do the following.
//		Input: "When the world realise its own mistake, corona will dissolve automatically"
//		output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"

		String input= "When the world realise its own mistake, corona will dissolve automatically";
		String[] split = input.split(" ");
		for (int i=0;i<split.length;i++)
		{
			if(i%2!=0)
			{
				StringBuffer sb=new StringBuffer(split[i]);
				split[i]=sb.reverse().toString();
				
			}
			
		}
		for(int i=0;i<split.length;i++)
		{
			System.out.print(split[i] + " ");
	}


		}}

