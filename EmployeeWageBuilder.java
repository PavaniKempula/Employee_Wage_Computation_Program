package com.bridgelabz;

/*
 * @author Pavani
 * 
 * With respect to employees attendance,
 * Calculating employee daily and monthly,
 * wage as per their Company's parameters
 */
public class EmployeeWageBuilder {
	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("------------------Welcome To Employee Wage Computation------------------");

		EmpWageComputationImpl empWageComputation = new EmpWageComputationImpl();
		empWageComputation.addCompany("Capgemini", 20, 2, 50);
		System.out.println("--------------------------------------------------------------------");
		empWageComputation.addCompany("Barclays", 10, 4, 100);
		empWageComputation.computEmpWage();
	}

}