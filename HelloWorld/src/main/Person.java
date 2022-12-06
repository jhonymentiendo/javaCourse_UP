package main;

public class Person {
	private String firstName;
    private String lastName;
    private int age;
    
    public boolean isTeen() {
    	boolean resp = false;
    	resp = this.getAge() > 12 && this.getAge()< 20;
    	return resp;
    }
    
    public String getFullName() {
    	String resp = new String(getFirstName() + " " +  getLastName());
    	return resp.trim();
    }
    
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = (age< 0 || age> 100) ? 0: age;
	}
    
}
