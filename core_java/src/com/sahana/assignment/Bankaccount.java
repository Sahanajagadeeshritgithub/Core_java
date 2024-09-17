package com.sahana.assignment;

//Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
 private static final long serialVersionUID = 1L;

 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid amounts
class InvalidAmountException extends Exception {
 private static final long serialVersionUID = 1L;

 public InvalidAmountException(String message) {
     super(message);
 }
}

public class Bankaccount {
 protected int accountNumber; // Use protected visibility to allow access in subclass
 protected double balance;

 // Parameterized constructor
 public Bankaccount(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive.");
     }
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
     }
     balance -= amount;
     System.out.println("Withdrew: " + amount);
 }

 // Method to display the account balance
 public void displayBalance() {
     System.out.println("Current balance: " + balance);
 }
}
