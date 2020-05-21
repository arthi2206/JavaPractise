package java_week1;

//import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
	
		//find the occurence of the character 'o' in the following string
		//input: "You have no choice other than following me!"
		//output: Occurence of o is 6
	
	String text ="You have no choice other than following me!";
	int textlength=text.length();
	int a=0;
	
		for (int i=0;i<textlength;i++) {
				
					if(text.charAt(i)=='o')
						{
							a=a+1;
						}
		}
					System.out.println("occurence of o: "+a);

}}
