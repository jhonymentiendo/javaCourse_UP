package main.inheritance;

public class Worker {

	private String name;
	private String bithDate;
	private String endDate;
	
	public Worker(String name, String bithDate, String endDate) {
		super();
		this.name = name;
		this.bithDate = bithDate;
		this.endDate = endDate;
	}
	
	public int getAge() {
		int resp = 0;
		
		return resp;
	}
	
	double  collectPay() {
		double resp = 0;
		
		return resp;
	}
	
	void terminate(String endDate) {
		this.endDate = endDate;
	}
	
}
