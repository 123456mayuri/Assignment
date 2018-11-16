package com.onkar.test;
import com.onkar.bank.BankAccount;
import com.onkar.bank.CurrentAccount;
import com.onkar.bank.SavingAccount;
public class TestBankAccount {

	public static void testBankAccountMethod(){
		//BankAccount acc= new BankAccount();
		//acc.setAccountHolderName("Sachin");	
	}
	
	public static void testSavingAccount(){
		SavingAccount savingAcc= new SavingAccount("mayuri", 40000);
		
		System.out.println("account no is " +savingAcc.getAccountNo());
		System.out.println("enter name " +savingAcc.getAccountHolderName());
		System.out.println("account bal is " +savingAcc.getAccountBalance());
		savingAcc.deposit(0);
		System.out.println("account bal is " +savingAcc.getAccountBalance());
		System.out.println("=====");
		savingAcc.withdraw(3000);
		System.out.println("account bal is " +savingAcc.getAccountBalance());
	}
	
	public static void testCurrentAccount() {
		CurrentAccount currentAcc =new CurrentAccount("mayuri", 40000);
		System.out.println("account no is " +currentAcc.getAccountNo());
		System.out.println("enter name " +currentAcc.getAccountHolderName());
		System.out.println("account bal is " +currentAcc.getAccountBalance());
		//System.out.println("ODLimit is " +currentAcc.());
		/*currentAcc.deposit(0);
		System.out.println("account bal is" +currentAcc.getAccountBalance());*/
		System.out.println("=====");
		currentAcc.withdraw(50000);
		System.out.println("account bal is" +currentAcc.getAccountBalance());
		System.out.println("ODLimit= "+currentAcc.getODLimit());
	}
	public static void main(String args[]) {
		//testBankAccountMethod();
		testSavingAccount();
		testCurrentAccount();
		
	}
}
