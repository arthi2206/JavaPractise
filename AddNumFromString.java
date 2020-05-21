package java_week1;

public class AddNumFromString {

	public static void main(String[] args) {
//		1. Write a java code to find the sum of the given numbers
//		Input: "asdf1qwer9as8d7"
//		output: 1+9+8+7 = 25
		String input="asdf1qwer9as8d7";
		int rem,sum=0;
		String re=input.replaceAll("\\D", "");
		System.out.println(re);
		int num=Integer.parseInt(re);
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("sum of digits : "+sum);
		



	}

}
