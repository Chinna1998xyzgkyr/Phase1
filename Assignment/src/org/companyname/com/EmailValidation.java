package org.companyname.com;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {
	
	
		   public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
		       
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("chinna@He.com");
		       emails.add("ram@helo.com");
		       emails.add("Junu@gill.com");
		       //invalid email addresses
		       emails.add("jonny.t.com");
		       emails.add("chello..uro@example.com");
		       emails.add("gopal@.kali.com");

		       for (String value : emails) {
		           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		       }
		       
		       System.out.println("Enter any email address ");
		       Scanner scan = new Scanner(System.in);
		       String input = scan.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}