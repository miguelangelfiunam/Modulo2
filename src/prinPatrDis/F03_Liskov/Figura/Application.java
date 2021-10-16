package prinPatrDis.F03_Liskov.Figura;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elipse elipse = new Elipse(10, 5); 
		
		Elipse circulo2 = new Circulo(7);
//		System.out.println(circulo2.calcularArea());
		
		menu(elipse);
		menu(circulo2);
		
	}
	
	public static void menu(Elipse elipse) {
		// TODO Auto-generated method stub
		elipse.setRadioMayor(10);
		elipse.setRadioMenor(5);
		System.out.println(elipse.getRadioMayor());
		System.out.println(elipse.getRadioMenor());
		System.out.println(elipse.calcularArea());
	}

}
