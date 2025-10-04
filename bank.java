package Bank;
import java.util.HashMap;
public class bank {
	private HashMap<Integer,Double>accounts=new HashMap<>();
	public void Createaccount(int accNo,double balance) {
		accounts.put(accNo,balance);
		System.out.println("Creating account " + accNo + " with " + balance);
	}
	public void deposit(int accNo,double amount) {
		if(accounts.containsKey(accNo)) {
			double newbalance=accounts.get(accNo) + amount;
			accounts.put(accNo,newbalance);
			System.out.println("Deposit " + amount + "in account " + accNo + "---balance="+newbalance);
		}else {
			System.out.println("Account "+ accNo + "not found!");
		}
	}
	public void withdraw(int accNo,double amount) {
		if (accounts.containsKey(accNo)) {
			double balance=accounts.get(accNo);
			if (balance>=amount) {
				double newBalance = balance - amount;
                accounts.put(accNo, newBalance);
                System.out.println("Withdraw " + amount + " from account " + accNo + " ..... Balance = " + newBalance);
			}else {
				System.out.println("Account "+ accNo + "not found!");
				}	
			}
		}
    public void checkBalance(int accNo) {
		        if (accounts.containsKey(accNo)) {
		            System.out.println("Account " + accNo + ": " + accounts.get(accNo));
		        } else {
		            System.out.println("Account " + accNo + " not found!");
		        }
		}
	
}
