package com.bridgelabz;

public class EmployeeWageBuilder {

	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("Welcome to Employee Wage Computation Program");

		// Variables
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int WAGE_PER_HR = 20;
		int empHrs = 0;
		int empWage = 0;

		/*
		 * Generating random number using math.random(), Converting it to nearest
		 * possible integer number using Math.floor(), By doing % 3 we will only get
		 * either number 0,1 or 2
		 */
		double empCheck = Math.floor(Math.random() * 10) % 3;

		// Checking Part Time & Full Time Employee and Wage
		if (empCheck == IS_PART_TIME) {
			empHrs = 4;
		} else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = WAGE_PER_HR * empHrs;
		System.out.println("Employee Wage :" + empWage);
	}

}