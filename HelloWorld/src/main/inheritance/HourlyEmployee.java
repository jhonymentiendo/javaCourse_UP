package main.inheritance;

public class HourlyEmployee extends Employee {
	
	private double hourlyPayRate;

	public HourlyEmployee(String name, String bithDate, String endDate, long employeeId, String hireDate,
			double hourlyPayRate) {
		super(name, bithDate, endDate, employeeId, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}
	
	public void getDoublePay() {
		
	} 
	
}
