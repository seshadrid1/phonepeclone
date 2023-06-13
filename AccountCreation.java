package assignment;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//===================================================Account creation===================================================
public class AccountCreation 
{
	public void numverify()
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your phone number for account creation \n1.Mobile number must be 10 digit\n2.only mobile number stating with (6-9) is acceptable");
		System.out.print("Please enter your mobile no: "+"\n+91-");
		
		
		long num=sc.nextLong();
		long n=num;
		int count=0;
		while(n>0)
		{
			long rem=n%10;
			count++;
			n/=10;
		}
		if(count==10)
		{
			System.out.println("\nOTP is generated to your number:"+num);
		}
		else {
				System.out.println("\nEnter valid number\n");
				numverify();
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("\n1.Wrong input\n2.Phone number should in number\nPlease Re-enter your phone correctly\n");
			try {
//				Scanner so=new Scanner(System.in);...
//				System.out.println("Enter your phone number for account creation \n1.Mobile number must be 10 digit\n2.only mobile number stating with (6-9) is acceptable");
//				System.out.print("Please enter your mobile no: "+"\n+91-");
//				long num=so.nextLong();
//				long n=num;
//				int count=0;
//				while(n>0)
//				{
//					int rem=(int) (n%10);
//					count++;
//					n/=10;
//				}
//				if(count==10)
//				{
//					System.out.println("\nOTP is generated to your number:"+num);
//				}
//				else {
//						System.out.println("\nEnter valid number\n");
//						numverify();
//					}
				numverify();
				}
				catch(InputMismatchException e1)
				{
					System.err.println("\n1.Wrong input\n2.Phone number should in number\nPlease Re-enter your phone correctly\n");
					numverify();
				}
		}
	}
}
//===============================================OTP Generation========================================
class OTP extends AccountCreation
{
	static int i=3;
	public static int validateotp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please re-enter generated OTP:");
		int otp=sc.nextInt();
		return otp;	
		}
	public void generateotp()
	{
		AccountCreation ac=new AccountCreation();
		ac.numverify();
		boolean b=true;
		
			Scanner sc=new Scanner(System.in);
			Random r=new Random();
			int otp=0;
			for(int i=1;i<=5;i++)
			{
				int o=r.nextInt(9);
				otp=otp*10+o;
			}
			System.out.println("Your OTP number is: "+otp);
				
					while(b==true)
					{
					try
					{	
						int otp2=validateotp();
						if(otp==otp2)
						{
							System.out.println("\n==================Successfully registered=================\n");
							System.out.println("Your mobile number registered with following banks");
							SelectBank sb=new SelectBank();
							sb.choosebank();
						}
						else 
						{	
							System.out.println("\nEnter proper OTP number\nEnter generated OTP");
							System.out.println("\nYour generated otp is: "+ otp);
							System.out.println(--i+" chances left");
							if(i==0)
							{
								System.out.println("You tried so many times try after 24hrs later");
								System.exit(0);
							}
					    }
				}
					
				catch(InputMismatchException e)
				{
					System.err.println("\n1.OTP should in number\n2.Enter valid OTP number which generated to your number");
					System.out.println(--i+" chances left");
					System.out.println("\nYour generated otp is: "+ otp);
					if(i==0)
					{
						System.out.println("You tried so many times try after 24hrs later");
						System.exit(0);
					}
				}
			}
	}
	
	}


	