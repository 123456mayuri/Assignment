package com.onkar.test;
import com.onkar.bank.BankAccount;;
public class TestBankAccount {

	public static void testBankAccountMethod(){
		BankAccount acc= new BankAccount();
		acc.setAccountHolderName("Sachin");	
	}
	public static void main(String args[]) {
		testBankAccountMethod();
		
	}
}
