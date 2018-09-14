package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	public BankAccount ba;

	@BeforeAll
	static void beforeAll() {
		System.out.println("Inicializa��o Globais");
	}
	
	@BeforeEach
	 void beforeEach() {
		System.out.println("Inicializa��o do BankAccont");
		 ba = new BankAccount(300,100,0);
	}
	
	
	@Test
	void testWithdraw() {
		ba.withdraw(50);
    	System.out.println(ba.getBalance());
    	assertTrue(ba.getBalance()==250);
	}

	@Test
	void testDeposit() {
		ba.deposit(100);
    	System.out.println(ba.getBalance());
    	assertTrue(ba.getBalance()==400);
	}

	@Test
	void testGetBalance() {
		System.out.println(ba.getBalance());
	}

	@Test
	public void testLimit(){
    	int value=50;
    	try {
    		ba.withdraw(150);
    		System.out.println(ba.getBalance());
    		if(value > ba.limit)
    		fail("fail lower then "+ba.limit);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw failed (limit), Balance is:"+ba.getBalance());
		}
    }
	
	
	@Test
	
	public void testMain() {
		BankAccount.main(null);
	}
	
	@Test
    public void testWithdraw0(){
    	try {
    		int value=1;
    		ba.withdraw(value);
    		System.out.println("ba "+ba.getBalance());
    		assertTrue(ba.getBalance()!=300,"not fail");
    	
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw failed (0 amound), Balance is:"+ba.getBalance());
		}
    }
    
	@Test
    public void testDeposit0(){
    	try {
    		int value=0;
    		ba.deposit(value);
    		System.out.println("ba "+ba.getBalance());
    		assertFalse(ba.getBalance()!=300,"not fail");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Deposit failed (0 amound), Balance is:"+ba.getBalance());
		}
    }
    
	@Test
    public void testWithdrawSmaller0(){
    	try {
    		int value=-1;
    		ba.withdraw(value);
    		System.out.println("ba "+ba.getBalance());
    		assertTrue(ba.getBalance()!=300,"not fail");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw failed (<0 amound), Balance is:"+ba.getBalance());
		}
    }
    
	@Test
    public void testDepositSmaller0(){
    	try {
    		int value=-10;
    		ba.deposit(value);
    		System.out.println("ba "+ba.getBalance());
    		if(value > ba.limit)
        		fail("fail lower then "+ba.limit);
    		//assertTrue("not fail", ba.getBalance()!=300);
    		
    		
    		
		}
		catch (IllegalArgumentException e) {
			System.out.println("Deposit failed (<0 amound), Balance is:"+ba.getBalance());
		}
    }
	
	@Test
    public void testLowest(){
    	int withdraw=400;
    	try {
    		
    		ba.withdraw(400);
    		System.out.println(ba.getBalance());
    		if(ba.balance<withdraw)
    			assertTrue(ba.getBalance()!=300,"not fail");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Withdraw failed (lowestbalance), Balance is:"+ba.getBalance());
		}
    }

}
