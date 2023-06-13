package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectBank 
{
		public void choosebank()
		{
			try
			{
				Singleton st=Singleton.instance();
			Scanner sc=new Scanner(System.in);
			System.out.println("\nPress 1 for SBI\nPress 2 for ICICI\nPress 3 for CUB\nPress 4 to exit");
			System.out.print("\nEnter your choice: \n");
			int choice=sc.nextInt();
			int count=0;
			int choose=choice;
			while(choose>0)
			{
				int rem=choose%10;
				count++;
				choose/=10;
			}
			if(count<2)
			{
			switch(choice)
			{
			case 1:SelectBank sb=new SelectBank();
			sb.sbipin();
			case 2:SelectBank sb1=new SelectBank();
			sb1.icicipin();
			case 3:SelectBank sb2=new SelectBank();
			sb2.cubpin();
			case 4: choosebank();
				System.exit(0);
			
			}
			}
			else
			{
				System.out.println("\nEnter valid choice\n");
				choosebank();
			}
			}
			
			catch(Exception e)
			{
				System.err.println("\nGive choice in number\n");
				choosebank();
			}
		}
			
		
//		============================================sbipin===============================================
		static long pin;
		public static long sbipin()
		{
			boolean b=true;
			while(b=true)
			{
			try
			{
				Scanner sc=new Scanner(System.in);
				Singleton sb=Singleton.instance();
				System.out.println("\nWelcome to SBI Bank\n");
				System.out.print("Set your upi: ");
				pin=sc.nextLong();
				long pin1=pin;int count=0;
				while(pin1>0)
				{
					long rem=pin1%10;
					count++;
					pin1/=10;
				}
				if(count==6)
				{
					System.out.println("\nYOUR SBI BANK UPIPIN IS SUCCESSFULLY CREATED\n");
					sb.setSBIupipin(pin);
					one();
				}
				else
				{
					System.out.print("\n1.Enter valid input\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)");
					sbipin();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.UPIpin contains only number\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)\n");
				sbipin();
			}
			}
			return pin;
		}
//		===============================================icici pin===========================================
		static long icicipin2;
		public static long icicipin()
		{
			boolean b=true;
			while(b=true)
			{
			try
			{
				Scanner sc=new Scanner(System.in);
				Singleton sb=Singleton.instance();
				System.out.println("\nWelcome to ICICI Bank\n");
				System.out.print("Set your upi: ");
				icicipin2=sc.nextLong();
				long pin2=icicipin2;int count=0;
				while(pin2>0)
				{
					long rem=pin2%10;
					count++;
					pin2/=10;
				}
				if(count==6)
				{
					System.out.println("\nYOUR ICICI BANK UPIPIN IS SUCCESSFULLY CREATED\n");
					sb.setICICIupipin(icicipin2);
					two();
				}
				else
				{
					System.out.print("\n1.Enter valid input\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)");
					icicipin();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.UPIpin contains only number\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)\n");
				icicipin();
			}
			}
			return icicipin2;
		}
		
//		==================================================cub pin==================================================
		static long cubpin3;
		public static long cubpin()
		{
			boolean b=true;
			while(b=true)
			{
			try
			{
				Scanner sc=new Scanner(System.in);
				Singleton sb=Singleton.instance();
				System.out.println("\nWelcome to CUB Bank\n");
				System.out.print("Set your upi: ");
				cubpin3=sc.nextLong();
				long pin1=cubpin3;int count=0;
				while(pin1>0)
				{
					long rem=pin1%10;
					count++;
					pin1/=10;
				}
				if(count==6)
				{
					System.out.println("\nYOUR CUB BANK UPIPIN IS SUCCESSFULLY CREATED\n");
					sb.setCUBupipin(cubpin3);
					three();
				}
				else
				{
					System.out.print("\n1.Enter valid input\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)");
					cubpin();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.println("\n1.UPIpin contains only number\n2.UPIPIN contains only 6 digits\n3.It should start with zero(0)\n");
				cubpin();
			}
			}
			return cubpin3;
		}
		
//		=================================================calling inside bank===========================================
		public static void one()
		{
			try 
			{
				SelectBank sb=new SelectBank();
				System.out.println("\n Welcome to SBI bank\nPress 1 balance\nPress 2 for amount transfer\npress 3 to continue\nPress 4 to exit from bank\n");
				Scanner sc=new Scanner(System.in);
				System.out.print("\nPlease enter your option: ");
				int choice=sc.nextInt();
				int count=0;
				int choose=choice;
				while(choose>0)
				{
					int rem=choose%10;
					count++;
					choose/=10;
				}
				if(count<2)
				{
				BankOption bo;
				switch(choice)
				{
				case 1:bo=new SBI();
				bo.balance();
				case 2:bo=new SBI();
				bo.transfer();
				case 3:sb.one();
				case 4:sb.choosebank();
					System.exit(0);
				
				}
				}
				else {
					System.out.print("\nEnter valid choice\n");
					one();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.print("\nEnter choice in valid number\n");
				one();
			}
		}
		public static void two()
		{
			try 
			{
				SelectBank sb=new SelectBank();
				System.out.println("\n Welcome to ICICI bank\nPress 1 balance\nPress 2 for amount transfer\nPress 3 to continue\nPress 4 to exit from bank\n");
				Scanner sc=new Scanner(System.in);
				System.out.print("\nPlease enter your option: ");
				int choice=sc.nextInt();
				int count=0;
				int choose=choice;
				while(choose>0)
				{
					int rem=choose%10;
					count++;
					choose/=10;
				}
				if(count<2)
				{
				BankOption bo;
				switch(choice)
				{
				case 1:bo=new ICICI();
				bo.balance();
				case 2:bo=new ICICI();
				bo.transfer();
				case 3:sb.two();
				case 4:sb.choosebank();
					System.exit(0);
					
				
				}
				}
				else {
					System.out.print("\nEnter valid choice\n");
					two();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.print("\nEnter choice in valid number\n");
				two();
			}
		}
		public static void three()
		{
			try 
			{
				SelectBank sb=new SelectBank();
				System.out.println("\n Welcome to CUB bank\nPress 1 balance\nPress 2 for amount transfer\nPress 3 to exit\nPress 4 to exit from bank\n");
				Scanner sc=new Scanner(System.in);
				System.out.print("\nPlease enter your option: ");
				int choice=sc.nextInt();
				int count=0;
				int choose=choice;
				while(choose>0)
				{
					int rem=choose%10;
					count++;
					choose/=10;
				}
				if(count<2)
				{
				BankOption bo;
				switch(choice)
				{
				case 1:bo=new CUB();
				bo.balance();
				case 2:bo=new CUB();
				bo.transfer();
				case 3:sb.three();
				case 4: sb.choosebank();
					System.exit(0);
				}
				}
				else {
					System.out.print("\nEnter valid choice\n");
					three();
				}
			}
			catch(InputMismatchException e)
			{
				System.err.print("\nEnter choice in valid number\n");
				three();
			}
		}
		public static void exit()
		{
			System.exit(0);
		}
}