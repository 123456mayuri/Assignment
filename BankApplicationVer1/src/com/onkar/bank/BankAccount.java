//Access specifire
//within class.....private--public
//outside class bt within same pkg.......public
//outside class as well as outside pkg.....public


package com.onkar.bank;//collection of classes

import java.util.Scanner;

public class BankAccount {
	
//static variable
	//one copy shared among the object,,,,,,dont wait for object creation....while creating cls it will execute
	//offering some common fundamental:::purpose of static
 private static int autoAccountNo;
	
//instance variable/class variable
//we cannot access instance variable, if object is not created
 private static int accountNo;
 private String accountHolderName;
 private double accountBalance;
 
 //init block: reduce redundancy
 //before intialization any thing, first init block execute
 {
	
	 accountNo=++autoAccountNo;
 }
 //intializing the instance variable/member variable/class variable
 //constructors are automatically call, at the time of object creation
 
 //Default constructor
 public BankAccount(){
	 accountHolderName="Unknow";
	 accountBalance=0;
 }
 
 //offering variety called cons overloading
//paramterize constructor
 //after supplying parameter,object will created.
 public BankAccount(String accountHolderName, double accountBalance){
	
	 
	this.accountHolderName=accountHolderName;
	 this.accountBalance=accountBalance;
	
 }
 
 
 //setter method: modify/reinitialize member variable
 public void setAccountHolderName(String accountHolderName){
	 this.accountHolderName=accountHolderName;
 }
 
 //getter:
 public  int getAccountNo() {
		return accountNo;
	}
 

 public String getAccountHolderName() {
	return accountHolderName;
}
 public double getAccountBalance() {
	return accountBalance;
}
 
 //Service method:
 public void withdraw(double amount){
	 if(amount>=0 && amount <accountBalance ){
		 accountBalance=accountBalance-amount;
		 System.out.println(accountBalance);
	 }else{
		 System.out.println("invalid");
	 }
	 this.accountBalance-=amount;
 }
 
 public void deposit(double amount){
	 if(amount<=0 ){
		 accountBalance=accountBalance+amount;
		 System.out.println(accountBalance);
	 }else{
		 System.out.println("invalid");
	 }
	 this.accountBalance+=amount;
 }
 public static void main(String args[]){
	 BankAccount acc=new BankAccount();
	 BankAccount acc2=new BankAccount("Onkar" , 5000);
	 Scanner scanner=new Scanner(System.in);
	 double amount;
	 System.out.println("enter amount");
	 amount=scanner.nextDouble();
	 acc2.withdraw(amount);
	 
 }
}
