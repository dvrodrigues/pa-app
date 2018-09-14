package pa.app;

import java.util.logging.Logger;

/*
 * Created on 07-Nov-2005
 *
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author hqy1
 *
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	//Withdraw money
	public void withdraw(double amount){
			balance=balance-amount;
	}
	
	//Deposit money
	public void deposit(double amount){
		balance=balance+amount;
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}
	
	private static final Logger logger = Logger.getLogger( App.class.getName() );
    public static void main( String[] args )
    {
    	
		logger.info("Ola!");
			BankAccount ba = new BankAccount(300,100,0);
			logger.info(""+ba.getBalance());
	    	ba.withdraw(50);
	    	logger.info(""+ba.getBalance());
	    	ba.deposit(100);
	    	logger.info(""+ba.getBalance());
	}
}
