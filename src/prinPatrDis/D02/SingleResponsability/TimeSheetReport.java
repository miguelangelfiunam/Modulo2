package prinPatrDis.D02.SingleResponsability;

public class TimeSheetReport {
	public void printTimeSheetReport(Employee emp) {
		System.out.println("Time sheet of " + emp.getName());
		System.out.println("Hours worked: ...");
		System.out.println("Holidays: ...");
		System.out.println("Days off: ...");
	}
}
