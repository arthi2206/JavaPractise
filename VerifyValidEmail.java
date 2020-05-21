package java_week1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyValidEmail {

	public static void main(String[] args) {
//		1. Write a java program to verify whether the given String is valid email address.
//		Input: "balaji.chandrasekaran@testleaf.com"
//		output: true
//		Input: "balaji.c@tunatap.co.uk"
//		output: true
//		Input: "naveen e@tl.com"
//		output: false
//		Note: Spl characters like . _ are only allowed

		String input1="balaji.c@tunatap.co.uk";
		String pat="[a-z0-9._]+@[a-z].{3,}";
		Pattern comp = Pattern.compile(pat);
		Matcher matcher = comp.matcher(input1);
System.out.println(matcher.matches());
}}
