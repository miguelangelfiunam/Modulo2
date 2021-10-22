package prinPatrDis.A03_Encapsula_Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco bancoMexicano = new Banco("Banco de México", 1000);
		System.out.println(bancoMexicano.getDinero() + " MXN a JPY = " + bancoMexicano.convierteDineroMX("JP"));
	}

}
