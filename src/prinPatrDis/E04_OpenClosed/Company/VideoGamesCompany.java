package prinPatrDis.E04_OpenClosed.Company;

import java.util.List;

public class VideoGamesCompany implements Company {
	private String name;
	private List<Employee> employees;
	
	public VideoGamesCompany(String name) {
		this.name = name;
	}

	public VideoGamesCompany(String name, List<Employee> employees) {
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
		return "VideoGamesCompany [name=" + name + "]";
	}

}
