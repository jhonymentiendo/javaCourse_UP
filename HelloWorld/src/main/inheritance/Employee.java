package main.inheritance;

public class Employee extends Worker{

	private long employeeId;
	private String hireDate;
	
	public Employee(String name, String bithDate, String endDate, long employeeId, String hireDate) {
		super(name, bithDate, endDate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}
	
	
	
}
