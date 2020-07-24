package com.cursojava.usothreads.Banco;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsoBancoConThreads {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		Transfers transfers = new Transfers(b);
		
		for(int i = 0; i < 100; i ++) {
			Thread t = new Thread(transfers);
			t.start();
		}
		
	}

}


/* ================= CLASS BANK ================ */

class Bank {
	private ArrayList<Account> accountRecord;
	private Lock transfersLock = new ReentrantLock();
	
	
	public Bank() {
		accountRecord = new ArrayList<Account>();
		fillAccountRecord();
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
		double moneySum = 0;
		for(Account c: accountRecord) {
			moneySum += c.getBalance();
		}
		System.out.printf("Total amount: %.2f " , moneySum);
	}
	
	public  void  makeTransfer(double moneyAmount, Account originAccount, Account receivingAccount) {
		
			transfersLock.lock();
			
			try {
				System.out.println("We are in thread " + Thread.currentThread());
				originAccount.takeMoneyOut(moneyAmount);
				receivingAccount.depositMoney(moneyAmount);
				
				getTotalAmountOfMoney();
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				transfersLock.unlock();
			}
			
			
			
	
		
	}
	

}
/* ================= CLASS ACCOUNT ================ */
class Account {
	public static int nextId = 0;
	private int id;
	private double balance;

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

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void takeMoneyOut(double moneyAmount) {
		this.balance -= moneyAmount;
	}
	
	public void depositMoney(double moneyAmount) {
		this.balance += moneyAmount;
	}
	

	@Override
	public String toString() {
		return String.format("Account: %03d | Balance: %d$", id, balance);
	}
	
}

/* ================= CLASS TRANSFERS ================ */
class Transfers implements Runnable{
	
	private Bank banco;
	public Transfers(Bank banco) {
	
		this.banco = banco;

	}

	
	@Override
	public void run() {
		
		while(true) {
			Account originAccount = 
					banco.getAccountRecord().get((int)(Math.random() * banco.getAccountRecord().size()));
			Account receivingAccount = 
					banco.getAccountRecord().get((int)(Math.random() * banco.getAccountRecord().size()));
			double amount = (Math.random() * originAccount.getBalance() );
			
			banco.makeTransfer(amount, originAccount, receivingAccount);
			
			System.out.println(String.format(
					"Transfer completed | %.2f$ from account %03d to account %03d ",
					amount, originAccount.getId(), receivingAccount.getId()));
			
			
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}