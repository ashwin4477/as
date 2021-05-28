package day2lab;

import java.util.Scanner;

public class EmployeeSal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float basic_salary, gross_salary, DA, HRA;
		System.out.print("Enter basic salary of an employee :");
		basic_salary=input.nextFloat();
		 if(basic_salary <= 10000)
		 {
		 DA = basic_salary * 0.8f;
		 HRA = basic_salary * 0.2f;
		 }
		 else if(basic_salary <= 20000)
		 {
		 DA = basic_salary * 0.9f;
		 HRA = basic_salary * 0.25f;
		 }
		 else
		 {
		 DA = basic_salary * 0.95f;
		 HRA = basic_salary * 0.3f;
		 }
		 
		 gross_salary = basic_salary + HRA + DA;
		 System.out.println("Gross Salary of Employee = "+gross_salary);
		input.close();
		
	}
    
}
