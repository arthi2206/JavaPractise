package java_week1;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
//		Write a java program to validate the given username is valid or not
//		Input: "Balaji_1"
//		output: false
//		Input: "Testleaf$123"
//		output: false
//		Note: 
//		1. It should contain minimum 8 characters.
//		2. It allows alpha numeric characters and spl characters like . _ @ $

		String input="Testleaf$123";
		String pat="[a-zA-Z0-9._@$]{8,}";
		Pattern.compile(pat);
		boolean matches = pat.matches(input);
		System.out.println(matches);
	}

}
