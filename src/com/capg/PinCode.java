package com.capg;
import java.util.Scanner;
import java.util.regex.*;
public class PinCode {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String pin;
		System.out.println("Welcome to Pincode validator");
		Pattern p=Pattern.compile("^[1-9]{1}[0-9]{5}");
		System.out.println("Enter a pincode:");
		pin=s.nextLine();
		Matcher match=p.matcher(pin);
		boolean m=match.matches();
		if(m) {
			System.out.println("Valid Pincode");
		}
		else {
			System.out.println("Invalid Pincode");
		}
		
	}
}
