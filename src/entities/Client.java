package entities;

public class Client {
	private int accountNumber;
	private double accountBalance;
	private String name;

	public Client(int accountNumber, double initialDeposit, String name) {
		super();
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
		this.name = name;
	}

	public Client(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public void withdraw(double amount) {
		accountBalance -= amount + 5;
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: %.2f", accountNumber, name, accountBalance);
	}
}
