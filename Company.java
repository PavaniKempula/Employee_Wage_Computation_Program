package com.bridgelabz;

public class Company {

	public static String company;
	public static int wagePerHrs;
	public static int numOfWorkinDays;
	public static int maxHrsPerMonth;
	public int totalEmpWage;

	public Company(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth) {
		this.company = company;
		this.wagePerHrs = wagePerHrs;
		this.numOfWorkinDays = numOfWorkinDays;
		this.maxHrsPerMonth = maxHrsPerMonth;

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "company Name ='" + company + '\'' + ", \nTotal Emploee Wage =" + totalEmpWage + "\n---------------------------------------------------------------------";
	}

}
