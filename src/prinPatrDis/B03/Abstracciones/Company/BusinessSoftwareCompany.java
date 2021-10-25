package prinPatrDis.B03.Abstracciones.Company;

import java.util.List;

public class BusinessSoftwareCompany implements Company {

	private String name;
	private List<Employee> employees;

	public BusinessSoftwareCompany(String name) {
		this.name = name;
	}

	public BusinessSoftwareCompany(String name, List<Employee> employees) {
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

	@Override
	public String toString() {
		return "BusinessSoftwareCompany [name=" + name + "]";
	}

}
