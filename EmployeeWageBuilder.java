package com.bridgelabz;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		
		// Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// Variables
		final int IS_PRESENT = 1;
		final int WAGE_PER_HR = 20;
		int empHrs = 0;
		int empWage = 0;

		/*
		 * Generating random number using math.random(), Converting it to nearest
		 * possible integer number using Math.floor(), By doing % 2 we will only get
		 * either number 0 Or 1
		 */
		double empCheck = Math.floor(Math.random() * 10) % 2;

		// Calculating Daily Employee Wage
		if (empCheck == IS_PRESENT) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = WAGE_PER_HR * empHrs;
		System.out.println("Employee Wage :" + empWage);
	}

}