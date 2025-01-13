package homework_day02;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//  user enter employee's name
        System.out.print("Enter the employee's name: ");
        String name = sc.nextLine();

        //  user enter the basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();

        // gross salary by adding 40% bonus
        double bonus = 0.40 * basicSalary;
        double grossSalary = basicSalary + bonus;

        //
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Gross Salary (with 40% bonus): " + grossSalary);
    }
}