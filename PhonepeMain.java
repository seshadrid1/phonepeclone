package assignment;

import java.util.Scanner;

public class PhonepeMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tWelcome to Phonepe application\n\n");
		OTP otp=new OTP();
		otp.generateotp();
	
		}

}
