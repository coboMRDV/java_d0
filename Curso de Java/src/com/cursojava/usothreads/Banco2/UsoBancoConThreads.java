package com.cursojava.usothreads.Banco2;

import java.util.ArrayList;

public class UsoBancoConThreads {

	public static void main(String[] args) {
		
		Bank b = new Bank();

		b.fillAccountRecord();
		b.showAccountRecord();
		
		b.start();
		b.showAccountRecord();
		
		
	}

}


/* ================= CLASS BANK ================ */

class Bank extends Thread{
	private ArrayList<Account> accountRecord;
	

	public Bank() {
		accountRecord = new ArrayList<Account>();
	
	}
	
	public void fillAccountRecord() {
		for (int i = 0; i < 100; i++) {
			Account c = new Account();
			accountRecord.add(c);
		}
	}
	
	public ArrayList<Account> getAccountRecord() {
		return accountRecord;
	}
		
	public void showAccountRecord() {
		for(Account c: accountRecord) {
			System.out.println(c.toString());
		}
	}
	
	public  void getTotalAmountOfMoney() {
		int moneySum = 0;
		for(Account c: accountRecord) {
			moneySum += c.getSaldo();
		}
		System.out.println("Total amount: " + moneySum + "$");
	}
	
	public  void  makeTransfer(int moneyAmount, Account originAccount, Account receivingAccount) {
		originAccount.takeMoneyOut(moneyAmount);
		receivingAccount.depositMoney(moneyAmount);
		
		this.getTotalAmountOfMoney();
		
	}
	

	@Override
	public void run() {
		for(int i = 0; i < 100; i ++ ) {
			try {
				Thread.sleep(200);
				Account originAccount = 
						this.getAccountRecord().get((int)(Math.random() * this.getAccountRecord().size()));
				Account receivingAccount = 
						this.getAccountRecord().get((int)(Math.random() * this.getAccountRecord().size()));
				int amount = (int)(Math.random() * originAccount.getSaldo() );
				
				makeTransfer(amount, originAccount, receivingAccount);
				
				System.out.println(String.format(
						"Transfer completed | %4s$ from account %03d to account %03d ",
						amount, originAccount.getId(), receivingAccount.getId()));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.showAccountRecord();
		this.getTotalAmountOfMoney();
	}

}

/* ================= CLASS ACCOUNT ================ */

class Account {
	public static int nextId = 0;
	private int id;
	private int balance;

	public Account() {
		nextId++;
		this.id = nextId;
		this.balance = 2000;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSaldo() {
		return balance;
	}

	public void setSaldo(int balance) {
		this.balance = balance;
	}
	
	public void takeMoneyOut(int amount) {
		this.balance -= amount;
	}
	
	public void depositMoney(int amount) {
		this.balance += amount;
	}
	

	@Override
	public String toString() {
		return String.format("Account: %03d | Balance: %d$", id, balance);
//		return "Account " + id + ", balance: " + balance;
	}
	
}