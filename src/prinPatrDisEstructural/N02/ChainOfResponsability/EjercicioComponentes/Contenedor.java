package prinPatrDisEstructural.N02.ChainOfResponsability.EjercicioComponentes;

import java.util.ArrayList;
import java.util.List;

import prinPatrDis.F02.Liskov.WriteDocument;

abstract class Contenedor extends Componente {

	protected List<Componente> hijo = new ArrayList<Componente>();

	public void agregaHijo(Componente componente) {
		hijo.add(componente);
		componente.contenedor = this;
	}

	public Componente obtenerComponente(int posXCursor, int posYCursor) {
		Componente comp = null;
		// this.estaEnElComponente(posXCursor, posYCursor);
		if (hijo.size() > 0) {
			for (Componente componente : hijo) {
				comp = componente.obtenerComponente(posXCursor, posYCursor);
				if (comp != null) {
					break;
				}
			}
			if (comp == null) {
				if ((this instanceof Panel)) {
					comp = ((Panel) this).obtenerComponentePanel(posXCursor, posYCursor);
				}
			}
		}
		return comp;
	}
}