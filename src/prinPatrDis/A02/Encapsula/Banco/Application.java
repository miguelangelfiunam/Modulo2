package prinPatrDis.A02.Encapsula.Banco;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco bancoMexicano = new Banco("Banco de México", 1000, "JP");
		System.out.println(
				"[" + bancoMexicano.getDinero() + "]" + " MXN -> [" + bancoMexicano.convierteDineroMX() + "] JPY");
		
	}

}
