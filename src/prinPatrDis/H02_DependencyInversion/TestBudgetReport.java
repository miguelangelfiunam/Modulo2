package prinPatrDis.H02_DependencyInversion;

/**
 * Principio de inversion de la dependencia
 * 
 * Las clases del negocio no deben depender de clases de bajo nivel. Ambas deben
 * depender de abstracciones.
 * 
 * - Crear interfaces para las operaciones de bajo nivel usando términos del
 * negocio.
 * 
 * - Las clases del negocio dependen de estas interfaces.
 * 
 * - Las clases de bajo nivel implementan estas interfaces.
 * 
 * @author Miguel Angel Martinez Rivera
 *
 */
public class TestBudgetReport {
	public static void main(String[] args) {
		BudgetReport budgetReport = new BudgetReport();
		budgetReport.save();
		budgetReport.update();
		budgetReport.delete();
	}
}
