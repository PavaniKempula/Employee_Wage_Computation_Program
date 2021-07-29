package com.bridgelabz;

public class EmployeeWageBuilder {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_PRESENT = 1;
		
		/*
		 * Generating random number using math.random(), Converting it to nearest
		 * possible integer number using Math.floor(), By doing % 2 we will only get
		 * either number 0 or 1.
		 */
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		// Checking Employee is Present or Absent
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
		
	}
	
}