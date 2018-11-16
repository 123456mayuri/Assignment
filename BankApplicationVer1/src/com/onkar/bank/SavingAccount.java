package com.onkar.bank;

public class SavingAccount extends BankAccount {

private boolean isSalaryAccount;

 public SavingAccount(String accountHolderName, double accountBalance) {
	 super(accountHolderName,accountBalance);
	this.isSalaryAccount=true;
}

 public SavingAccount() {
	this.isSalaryAccount=true;
}
 
 public SavingAccount(String accountHolderName, double accountBalance,boolean isSalaryAccount) {
	 super(accountHolderName,accountBalance);
	this.isSalaryAccount=true;
}
 public boolean isSalaryAccount(){
	 return isSalaryAccount;
 }
 
 public void withdraw(double amount){
	
 }
}