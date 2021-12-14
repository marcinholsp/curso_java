package application;

import entities.Client;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client;
		int accountNumber;
		String name;
		double value;
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		
		char option = sc.next().charAt(0);
		while (option != 'y' && option != 'n') {
			System.out.print("Invalid option. Please set again (y/n): ");
			option = sc.next().charAt(0);
		}
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			client = new Client(accountNumber, value, name);
		}
		else 
			client = new Client(accountNumber, name);
		
		System.out.println();
		System.out.println("Account data:\n" + client);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		client.deposit(value);
		System.out.println("Updated data:\n"+ client);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		client.withdraw(value);
		System.out.println("Updated data:\n"+ client);
		
		sc.close();
	}
}
