package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count, id;
		String name;
		double salary;
		Employee employee;
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registred? ");
		count = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i = 1; i <= count; i++) {
			System.out.printf("Employee #%d:%n", i);
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			sc.nextLine();
			employee = new Employee(id, name, salary);
			list.add(employee);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increased : ");
		id = sc.nextInt();
		for (Employee element : list ) {
			if (element.getId() == id) {
				System.out.print("Enter the percentage: ");
				double increasePercentage = sc.nextDouble();
				element.increaseSalary(increasePercentage);
				break;
			}
			if (list.indexOf(element) == list.size() - 1)
				System.out.println("This id does not exist!");
		}
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee element : list)
			System.out.println(element);
		
		sc.close();
	}
}
