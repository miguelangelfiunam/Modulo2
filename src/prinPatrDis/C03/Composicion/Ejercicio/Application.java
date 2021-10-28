package prinPatrDis.C03.Composicion.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television_FHD tv_1 = new Television_FHD();
		tv_1.comprar();
		
		Television_HD tv_2 = new Television_HD();
		tv_2.comprar();
		
		Television tv_3 = new Television();
		tv_3.comprar();
		
		TelevisionLCD_FHD tv_4 = new TelevisionLCD_FHD();
		tv_4.comprar();
		
		TelevisionPlasma_FHD tv_5 = new TelevisionPlasma_FHD();
		tv_5.comprar();
		
		TelevisionPlasma_HD tv_6 = new TelevisionPlasma_HD();
		tv_6.comprar();
	}

}
