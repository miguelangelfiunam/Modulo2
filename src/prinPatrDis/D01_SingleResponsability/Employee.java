package prinPatrDis.D01_SingleResponsability;

public class Employee {
	private String name;
	private String ssn;

	public Employee(String name) {
		this.name = name;
	}

	public void printTimeSheetReport() {
		System.out.println("Time sheet of " + name);
		System.out.println("Hours worked: ...");
		System.out.println("Holidays: ...");
		System.out.println("Days off: ...");
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
