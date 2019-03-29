package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitties.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter employee data: ");
		System.out.print("name: ");
		employee.name = sc.nextLine();
		System.out.print("grossSalary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);

		System.out.println();
		Double percentage;
	
		System.out.println("Enter percentage data: ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data: " + employee );
		
		
	}

}
