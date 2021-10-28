package prinPatrDis.C04.Composicion.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resolucion r_1 = new Resolucion_FHD();
		Tecnologia t_1 = new TecnologiaLCD();
		Television tv_1 = new Television(r_1, t_1);
		tv_1.comprar();
		
		System.out.println("");
		
		Resolucion r_2 = new Resolucion_HD();
		Tecnologia t_2 = new TecnologiaPlasma();
		Television tv_2 = new Television(r_2, t_2);
		tv_2.comprar();
	}

}
