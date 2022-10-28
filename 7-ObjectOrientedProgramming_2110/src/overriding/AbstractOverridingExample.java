package overriding;

abstract class ManageAccount {
	
	private void message() {
		System.out.println("Private Message Here..");
	}

	public void welcome() {
		message();
		System.out.println("Something Here");
	}

	
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC Bank!!");
	}
	
	public abstract void openAccount();

	public abstract void closeAccount();
}

abstract class BankAccount extends ManageAccount {
	
	protected  abstract void deposit();

	public abstract void withdraw();

	public abstract void balance();
}

class SavingAccount extends BankAccount {
	
	private void message() {
		System.out.println("Private Message Here..");
	}

	@Override
	protected  void deposit() {
		message();
		super.welcome();
		System.out.println("Deposit in Saving Account.");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawal from Saving Account.");

	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account.");

	}

	@Override
	public void openAccount() {
		System.out.println("Opening Bank Account.");

	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Bank Account.");

	}

}

class CurrentAccount extends BankAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Current Account.");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawal from Current Account.");

	}

	@Override
	public void balance() {
		System.out.println("Balance in CurrentAccount.");

	}

	@Override
	public void openAccount() {
		System.out.println("Opening Bank Account.");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Closing Bank Account.");
		
	}

}

public class AbstractOverridingExample {

	public static void main(String[] args) {
		
		ManageAccount.welcomeMessage();

		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount();
		savingAccount.deposit();
		savingAccount.withdraw();
		savingAccount.balance();
		savingAccount.closeAccount();

		System.out.println("------------------------------");

		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.openAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.balance();
		currentAccount.closeAccount();

	}

}
