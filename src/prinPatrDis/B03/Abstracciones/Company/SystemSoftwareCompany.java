package prinPatrDis.B03.Abstracciones.Company;

import java.util.List;

public class SystemSoftwareCompany implements Company {
	private String name;
	private List<Employee> employees;
	
	public SystemSoftwareCompany(String name) {
		this.name = name;
	}

	public SystemSoftwareCompany(String name, List<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}

	@Override
	public String createSoftware(String systemName) {
		// TODO Auto-generated method stub
		StringBuilder system = new StringBuilder();
		for (Employee employee : employees) {
			system.append(employee.activity(systemName));
		}
		return system.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SystemSoftwareCompany [name=" + name + "]";
	}

}
