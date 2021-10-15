package prinPatrDis.F02_Liskov;

/**
 * Principio de substitución de Liskov *****************************************
 * - El cliente debe poder pasar objetos de la subclase en lugar de objetos de
 * la clase padre sin que su código se rompa. *********************************
 * - En la sobreescritura hay que extender el comportamiento base en lugar de
 * reemplazarlo por completo.
 * 
 * @author Java
 *
 */
public class TestDocument {
	public static void main(String[] args) {
		Project project = new Project();
		Document actaProyecto = new ReadOnlyDocument("actaProyecto");
		Document actaProyecto_2 = new WriteDocument("actaProyecto");
		Document especificacionRequerimientos = new Document("especificacionRequerimientos");
		Document especificacionArquitectonica = new Document("especificacionArquitectonica");

		project.addDocument(actaProyecto);
		project.addDocument(actaProyecto_2);
		project.addDocument(especificacionArquitectonica);
		project.addDocument(especificacionRequerimientos);
		project.openAll();

		project.saveAll();
	}
}
