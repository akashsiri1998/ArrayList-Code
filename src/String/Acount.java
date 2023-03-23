package String;

public class Acount {
	private int balance=5000;

	 public int getBalance() {
		 return balance;
	 }
	 
	 public int getWithdrawal(int amount) {
		 
		 balance=balance-amount;
		 return balance;
	 }
}
