package assignment;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckBalance 
{
	static long repin;
	static boolean b=true;
	public static long sbireenter()
	{
		Singleton sb1=Singleton.instance();
		Scanner sc=new Scanner(System.in);
		while(b==true)
		{
			try
			{
		System.out.print("Re-enter your UPIPIN: ");
		repin=sc.nextInt();
		long pin1=repin;int count=0;
		while(pin1>0)
		{
			long rem=pin1%10;
			count++;
			pin1/=10;
		}
		if(count==6)
		{
			if(sb1.getSBIupipin()==repin)
			{
			b=false;
			sbicheckbalance();
			}
			else {
				System.out.println("\nEnter correct UPIPIN\n");
				sbireenter();
			}
		}
		else
		{
			System.out.println("\n1.Enter correct UPIPIN\n2.It contains only 6 digits\n");
			try
			{
			sbireenter();
			}
			catch(NumberFormatException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				sbireenter();
			}
		}
		}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				sbireenter();
			}
		}
		return repin;
	}
//	===============================================ICICI UPIPIN reenter===================================
	public static long icicireenter()
	{
		Singleton sb1=Singleton.instance();
		Scanner sc=new Scanner(System.in);
		while(b==true)
		{
			try
			{
		System.out.print("Re-enter your UPIPIN: ");
		repin=sc.nextInt();
		long pin1=repin;int count=0;
		while(pin1>0)
		{
			long rem=pin1%10;
			count++;
			pin1/=10;
		}
		if(count==6)
		{
			if(sb1.getICICIupipin()==repin)
			{
			b=false;
			icicicheckbalance();
			}
			else {
				System.out.println("\nEnter correct UPIPIN\n");
				icicireenter();
			}
		}
		else
		{
			System.out.println("\n1.Enter correct UPIPIN\n2.It contains only 6 digits\n");
			try
			{
			icicireenter();
			}
			catch(NumberFormatException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				icicireenter();
			}
		}
		}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				icicireenter();
			}
		}
		return repin;
	}
	
//	=============================================CUB UPIPIN reenter=======================================
	public static long cubreenter()
	{
		Singleton sb1=Singleton.instance();
		Scanner sc=new Scanner(System.in);
		while(b==true)
		{
			try
			{
		System.out.print("Re-enter your UPIPIN: ");
		repin=sc.nextInt();
		long pin1=repin;int count=0;
		while(pin1>0)
		{
			long rem=pin1%10;
			count++;
			pin1/=10;
		}
		if(count==6)
		{
			if(sb1.getCUBupipin()==repin)
			{
			b=false;
			cubcheckbalance();
			}
			else {
				System.out.println("\nEnter correct UPIPIN\n");
				cubreenter();
			}
		}
		else
		{
			System.out.println("\n1.Enter correct UPIPIN\n2.It contains only 6 digits\n");
			try
			{
			cubreenter();
			}
			catch(NumberFormatException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				cubreenter();
			}
		}
		}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.Enter UPIPIN numbers\n2.UPIPIN contains only number\n");
				cubreenter();
			}
		}
		return repin;
	}
//	=======================================check balance sbi===========================================
	public static void sbicheckbalance()
	{
				Singleton sb1=Singleton.instance();
				CheckBalance cb=new CheckBalance();
				if(sb1.getSBIupipin()==cb.sbireenter())
				{
					System.out.println("Your current balance is: "+sb1.getSBIbalance()+"\n");
					SelectBank.one();
				}
				else
				{
					try
					{
					sbireenter();
					}
					catch(NumberFormatException e)
					{
						System.out.println("\n1.Enter correct UPIPIN\2.UPIPIN contains only 6 digits");
						sbireenter();
					}
				}
			}
	public static void icicicheckbalance()
	{
				Singleton sb1=Singleton.instance();
				CheckBalance cb=new CheckBalance();
				if(sb1.getICICIupipin()==cb.icicireenter())
				{
					System.out.println("Your current balance is: "+sb1.getICICIbalance()+"\n");
					SelectBank.two();
				}
				else
				{
					System.out.println("\n1.Enter correct UPIPIN\2.UPIPIN contains only 6 digits");
					icicireenter();
				}
			}
	public static void cubcheckbalance()
	{
				Singleton sb1=Singleton.instance();
				CheckBalance cb=new CheckBalance();
				if(sb1.getCUBupipin()==cb.cubreenter())
				{
					System.out.println("Your current balance is: "+sb1.getCUBbalance()+"\n");
					SelectBank.three();
				}
				else
				{
					System.out.println("\n1.Enter correct UPIPIN\2.UPIPIN contains only 6 digits");
					cubreenter();
				}
			}
		}


