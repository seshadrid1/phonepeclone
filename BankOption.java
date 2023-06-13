package assignment;

import java.util.Scanner;
interface BankOption
	{
		void balance();
		void transfer();
		void exit();
	}
//======================================SBI Bank===========================================
	class SBI implements BankOption
	{
		SelectBank sb=new SelectBank();
		CheckBalance cb=new CheckBalance();
		TransferAmount ta=new TransferAmount();
		@Override
		public void balance()
		
		{
			cb.sbicheckbalance();
			sb.one();
		}

		@Override
		public void transfer() 
		{
			ta.sbicheckpin();
			sb.one();
			
		}

		@Override
		public void exit() {
			// TODO Auto-generated method stub
			
		}
	}
	
	//======================================CUB Bank===========================================
	class CUB implements BankOption
	{
		SelectBank sb=new SelectBank();
		CheckBalance cb=new CheckBalance();
		TransferAmount ta=new TransferAmount();
		@Override
		public void balance()
		
		{
			cb.cubcheckbalance();
			sb.three();
		}

		@Override
		public void transfer() 
		{
			ta.cubcheckpin();
			sb.three();
			
		}

		@Override
		public void exit() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class ICICI implements BankOption
	{
		SelectBank sb=new SelectBank();
		CheckBalance cb=new CheckBalance();
		TransferAmount ta=new TransferAmount();
		@Override
		public void balance()
		
		{
			cb.icicicheckbalance();
			sb.two();
		}

		@Override
		public void transfer() 
		{
			ta.icicicheckpin();
			sb.two();
			
		}

		@Override
		public void exit() {
			// TODO Auto-generated method stub
			
		}
	}

