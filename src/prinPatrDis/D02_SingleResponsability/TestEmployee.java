package prinPatrDis.D02_SingleResponsability;
/**
 * Principio de responsabilidad única
 * 
 * Una clase solo debe cambiar por una razón.
 * 		- Reducir la complejidad.
 * 		- Reducir el riesgo de romper la funcionalidad ante un cambio.

 * @author Miguel Angel Martinez Rivera
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeSheetReport report = new TimeSheetReport();
		Employee em2 = new Employee("Paco");
		report.printTimeSheetReport(em2);
	}

}
