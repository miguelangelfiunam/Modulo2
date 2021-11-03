package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

import java.util.ArrayList;
import java.util.List;

abstract class Contenedor extends Componente {
	protected List<Componente> hijo = new ArrayList<Componente>();

	public void agregaHijo(Componente componente) {
		hijo.add(componente);
		componente.contenedor = this;
	}
}
