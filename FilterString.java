package java_week1;

import java.util.concurrent.CountDownLatch;

public class FilterString {

	public static void main(String[] args) {
		// Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
		//Input: "1. It is Work from Home  not Work for Home"
		
		String input= "1. It is Work from Home  not Work for Home";
		//int up,low,space,num=0;
		System.out.println("Number of digits : "+ input.chars().filter((a)->Character.isDigit(a)).count());
		System.out.println("Number of upper case : "+ input.chars().filter((u)->Character.isUpperCase(u)).count());
		System.out.println("Number of lower case : "+input.chars().filter((l)->Character.isLowerCase(l)).count());
		System.out.println("Number of spaces : "+input.chars().filter((s)->Character.isSpaceChar(s)).count());
	}

}
