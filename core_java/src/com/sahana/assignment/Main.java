package com.sahana.assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Bankaccount account = new Bankaccount(12345, 1000.00);
		        try {
		            account.deposit(500.00);
		            account.displayBalance();
		            account.withdraw(200.00);
		            account.displayBalance();
		            account.withdraw(2000.00);
		        } catch (InvalidAmountException | InsufficientFundsException e) {
		            System.out.println("Exception: " + e.getMessage());
		        } finally {
		            account.displayBalance();
		        }

		        try {
		            account.deposit(-50.00);
		        } catch (InvalidAmountException e) {
		            System.out.println("Exception: " + e.getMessage());
		        } finally {
		            account.displayBalance();
		        }

		        
		        SavingsAccount savingsAccount = new SavingsAccount(67890, 1000.00, 200.00);
		        try {
		            savingsAccount.deposit(300.00);
		            savingsAccount.displayBalance();
		            savingsAccount.displayMinimumBalance();
		            savingsAccount.withdraw(900.00); // Should be allowed
		            savingsAccount.displayBalance();
		            savingsAccount.withdraw(200.00); // Should throw InsufficientFundsException
		        } catch (InvalidAmountException | InsufficientFundsException e) {
		            System.out.println("Exception: " + e.getMessage());
		        } finally {
		            savingsAccount.displayBalance();
		        }
		    }
		

	}
