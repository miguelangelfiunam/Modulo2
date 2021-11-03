package prinPatrDisEstructural.K01.AdapterShapes.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accion bursatil me regresa info en formato XML
		AplicacionBursatil aplicacion = new AplicacionBursatil();
		
		//Necesito un adaptador para poder transformar la info xml de en Json y asi poder trabajar
		//y generar la grafica ya con los datos convertidos
		XmlAdaptador xmlAdaptador = new XmlAdaptador(aplicacion.devuelveAccionesBursatiles());
		
		BibliotecaGraficacion biblioteca = new BibliotecaGraficacion(xmlAdaptador);
		biblioteca.realizaGrafica();

	}

}
