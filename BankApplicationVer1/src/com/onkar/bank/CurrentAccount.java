package com.onkar.bank;

public class CurrentAccount extends BankAccount{
double ODLimit;

{
	this.ODLimit=20000;
}
public CurrentAccount(String accountHolderName, double accountBalance) {
	 super(accountHolderName,accountBalance);
}

public double getODLimit() {
	return ODLimit;
}
public void getODLimit(double  oDLimit) {
	ODLimit = oDLimit;
}
public void withdraw(double amount){
	
	
	if( amount >accountBalance&&amount<(this.ODLimit+this.accountBalance) ){
		ODLimit=(accountBalance+ODLimit)-amount;
		accountBalance=0;
		
		 System.out.println("accountBalance="+accountBalance) ;
		 
	 }

}
}
