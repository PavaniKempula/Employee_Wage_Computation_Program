package com.bridgelabz;

/*
 * @author Pavani
 * 
 */
public class EmployeeWageBuilder {
	/*
	 * @param args
	 * 
	 * Creating objects of a class. 
	 * Calling different methods with objects if not
	 * static. Passing values while calling method.
	 */
	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("------------------Welcome To Employee Wage Computation------------------");

		EmpWageComputationImpl empWageComputation = new EmpWageComputationImpl();
		empWageComputation.addCompanyEmployee("Capgemini", 20, 2, 50);
		empWageComputation.addCompanyEmployee("Barclays", 10, 4, 100);
		empWageComputation.getCalculationDailyWage();
	}

}