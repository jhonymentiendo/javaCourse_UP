package main.inheritance;

public class SalariedEmployee extends Employee {
	
	private double AnnualSalary;
	private boolean isRetired;
	
	public SalariedEmployee(String name, String bithDate, String endDate, long employeeId, String hireDate,
			double annualSalary, boolean isRetired) {
		super(name, bithDate, endDate, employeeId, hireDate);
		this.AnnualSalary = annualSalary;
		this.isRetired = isRetired;
	}
	
	public void retire() {
		
	}
	
	
}
