package com.bridgelabz;

/**
 * @author Pavani
 * With respect to employees attendance,
 * Calculating employee daily and monthly wage. 
 */
public class EmployeeWageBuilder {

	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;
	private static final int WAGE_PER_HR = 20;
	private static final int NUM_OF_WORKING_DAYS = 20;
	private static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("Welcome To Employee Wage Computation Program");

		// Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		/*
		 * Generating random number using math.random(),
		 *  Converting it to nearest possible integer number using Math.floor(),
		 *   By doing % 3 we will only get either number 0,1 or 2
		 */
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day :" + totalWorkingDays + "Emp Hrs : " + empHrs);

		}
		totalEmpWage = totalEmpHrs * WAGE_PER_HR;
		System.out.println("Total Emp Hrs is:" + totalEmpHrs);
		System.out.println("Total Emp Wage is :" + totalEmpWage);
	}

}