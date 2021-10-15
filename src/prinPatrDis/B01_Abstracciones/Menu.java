package prinPatrDis.B01_Abstracciones;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cobe = new Cat("Cobe");
		Sausage sausage =  new Sausage(1, "Red", null);
		Fish fish =  new Fish(2.5, "Blue", null);
		Catchow catchow =  new Catchow(5, "Blue", null);
		System.out.println(cobe);
		cobe.eat(sausage);
		//cobe.eat(fish);
		System.out.println(cobe + "\n");
		//En este caso extendimos la funcionalidad del metodo comer para poder recibir diferentes
		//tipos de comida, diferencia que en el objeto de arriba solo se podia recibir
		//un solo tipo de comida
		Cat2 mushita = new Cat2("Mushita");
		System.out.println(mushita);
		mushita.eat(sausage);
		System.out.println(mushita);
		mushita.eat(fish);
		System.out.println(mushita);
		mushita.eat(catchow);
		System.out.println(mushita);
		
	}

}
