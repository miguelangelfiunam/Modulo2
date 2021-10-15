package prinPatrDis.D02_SingleResponsability;

public class Employee {
	private String name;
	private String ssn;

	public Employee(String name) {
		this.name = name;
	}
	

	public Employee(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
