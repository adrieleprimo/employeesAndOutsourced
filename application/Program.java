package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List <Employee> list = new ArrayList<>();
		for(int i = 1; i<=n;i++) {
			System.out.println();
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);	
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Name: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Hours: ");
			Integer employeeHours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double employeeValue = sc.nextDouble();
			if(answer == 'y') {
				System.out.print("Additional charge: ");
				Double additional = sc.nextDouble();
				list.add(new OutsourcedEmployee (employeeName, employeeHours, employeeValue, additional));
			}
			else {
				list.add(new Employee (employeeName, employeeHours, employeeValue));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		list.forEach(System.out::print);	
		sc.close();
	}
}
