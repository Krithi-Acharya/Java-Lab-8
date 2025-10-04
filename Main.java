package Bank;

public class Main {
	 public static void main(String[] args) {
	        bank bank = new bank();

	        bank.Createaccount(1001, 5000);
	        bank.Createaccount(1002, 2000);

	        
	        bank.deposit(1001, 1000);
	        bank.withdraw(1002, 500);

	        System.out.println("Final balances:");
	        bank.checkBalance(1001);
	        bank.checkBalance(1002);
	    }
	}

