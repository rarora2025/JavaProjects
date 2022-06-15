

public class Bank {
	
	private int accountID;
	private double balance;
	
	public Bank() {
		this.accountID = 00000;
		this.balance = 0.00;
		
	}
	public Bank(int accountID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
		
	}
	
	public void withdraw(double amount) {
		if(amount<= balance) {
			balance-= amount;
			
		} 
		
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	

	public String toString() {
		return "Balance for account " + this.accountID + ": " + this.balance;
	}

  
}