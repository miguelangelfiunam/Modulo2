package prinPatrDis.B03.Abstracciones.Company;

import java.util.ArrayList;
import java.util.List;

public class TestCompany {
	public static void main(String[] args) {
		List<Employee> employeesVG = new ArrayList<Employee>();
		Employee employee_1 = new DesignerEmployee();
		Employee employee_3 = new ProgrammerEmployee();
		Employee employee_4 = new TesterEmployee();
		employeesVG.add(employee_1);
		employeesVG.add(employee_3);
		employeesVG.add(employee_4);
		Company company = new VideoGamesSoftwareCompany("Microsoft", employeesVG);

		System.out.println(company);
		System.out.println(company.createSoftware("Age of Empires"));
		
		List<Employee> employeesSS = new ArrayList<Employee>();
		Employee employee_5 = new ProjectManagerEmployee();
		Employee employee_6 = new DesignerEmployee();
		Employee employee_7 = new ProgrammerEmployee();
		Employee employee_8 = new TesterEmployee();
		employeesSS.add(employee_5);
		employeesSS.add(employee_6);
		employeesSS.add(employee_7);
		employeesSS.add(employee_8);
		Company companySS = new SystemSoftwareCompany("CompanySS", employeesSS);

		System.out.println(companySS);
		System.out.println(companySS.createSoftware("Nomina"));
	}
}
