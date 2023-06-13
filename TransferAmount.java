package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransferAmount 
{
	static Singleton st=Singleton.instance();
//	==================================================SBI Transfer===================================
	
	

	static boolean b=true;
	public static void sbicheckpin()
	{
		 int i=3;
		SelectBank sb1=new SelectBank();
		while(b==true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter UPIPIN to proceed transaction: ");
		long check=sc.nextLong();
		if(check==st.getSBIupipin())
		{
			sbitransferamt();
		}
		else
		{
			System.out.print("\nRe-enter the UPIPIN correctly");
			System.out.println("\nOnly "+--i+" chances left.\n");
			if(i==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
		
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter valid UPIPIN\n");
			System.out.println("\nOnly "+--i+" chances left.\n");
			sbicheckpin();
			if(i==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
	}
	
	static double amt;
	
	public static double sbitransferamt()
	{
		SelectBank s=new SelectBank();
		AccountCreation ac=new AccountCreation();
		while(b=true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the amt to transfer: \n");
		amt=sc.nextDouble();
		
		if(amt<st.getSBIbalance())
		{
			double balance=st.getSBIbalance()-amt;
			System.out.println("\nTransaction Succesfully done\nYour current balance is: "+ balance);
			st.setSBIbalance(balance);
			s.one();
			
			}
		else
		{
			System.out.println("\nInsufficient balance\n");
			System.out.println("Your current balance is: "+st.getSBIbalance());
			sbitransferamt();
			
		}
		}
		
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter the transfer amount in number\n");
			sbitransferamt();
		}
	}
		return amt;
  }
//	==================================================ICICI Transfer===================================
	public static void icicicheckpin()
	{
		 int j=3;
		SelectBank sb1=new SelectBank();
		while(b==true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter UPIPIN to proceed transaction: ");
	
		long check=sc.nextLong();
		if(check==st.getICICIupipin())
		{
			icicitransferamt();
		}
		else
		{
			System.out.print("\nRe-enter the UPIPIN correctly");
			System.out.println("\nOnly "+--j+" chances left.\n");
			if(j==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
		
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter valid UPIPIN\n");
			System.out.println("\nOnly "+--j+" chances left.\n");
			icicicheckpin();
			if(j==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
	}

	public static double icicitransferamt()
	{
		SelectBank s=new SelectBank();
		AccountCreation ac=new AccountCreation();
		while(b=true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the amt to transfer: \n");
		amt=sc.nextDouble();
		
		if(amt<st.getICICIbalance())
		{
			double balance=st.getICICIbalance()-amt;
			System.out.println("\nTransaction Succesfully done\nYour current balance is: "+ balance);
			st.setICICIbalance(balance);
			s.two();
			}
		else
		{
			System.out.println("\nInsufficient balance\n");
			System.out.println("Your current balance is: "+st.getICICIbalance());
			icicitransferamt();
		}
		}
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter the transfer amount in number\n");
			icicitransferamt();
		}
	}
		return amt;
  }
//	================================================cub transfer===================================
	public static void cubcheckpin()
	{
		       int k=3;
		SelectBank sb1=new SelectBank();
		while(b==true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter UPIPIN to proceed transaction: ");
	
		long check=sc.nextLong();
		if(check==st.getCUBupipin())
		{
			cubtransferamt();
		}
		else
		{
			System.out.print("\nRe-enter the UPIPIN correctly");
			System.out.println("\nOnly "+--k+" chances left.\n");
			if(k==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
		
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter valid UPIPIN\n");
			System.out.println("\nOnly "+--k+" chances left.\n");
			cubcheckpin();
			if(k==0)
			{
				System.out.println("\nYou have too many times try 24hrs later\n");
				System.exit(0);
			}
		}
		}
	}

	public static double cubtransferamt()
	{
		SelectBank s=new SelectBank();
		AccountCreation ac=new AccountCreation();
		while(b=true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the amt to transfer: \n");
		amt=sc.nextDouble();
		
		if(amt<st.getCUBbalance())
		{
			double balance=st.getCUBbalance()-amt;
			System.out.println("\nTransaction Succesfully done\nYour current balance is: "+ balance);
			st.setCUBbalance(balance);
			s.three();
			}
		else
		{
			System.out.println("\nInsufficient balance\n");
			System.out.println("Your current balance is: "+st.getCUBbalance());
			icicitransferamt();
		}
		}
		catch(InputMismatchException e)
		{
			System.err.println("\nEnter the transfer amount in number\n");
			cubtransferamt();
		}
	}
		return amt;
  }
}

