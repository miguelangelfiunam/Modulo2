package prinPatrDis.G03.InterfaceSegregation.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bocina bocinaBose = new BocinaBose("BS-TY-88");
		Bocina bocinaSamsung = new BocinaSamsung("SM-SF-852");
		Bocina bocinaSony = new BocinaBose("SRS-X-99");
		
		bocinaBose.encender();
		bocinaBose.bluetooth();
		bocinaBose.cd();
		bocinaBose.karaoke();
		bocinaBose.radio();
		bocinaBose.apagar();
		System.out.println();
		bocinaSamsung.encender();
		bocinaSamsung.bluetooth();
		bocinaSamsung.cd();
		bocinaSamsung.karaoke();
		bocinaSamsung.radio();
		bocinaSamsung.apagar();
		System.out.println();
		bocinaSony.encender();
		bocinaSony.bluetooth();
		bocinaSony.cd();
		bocinaSony.karaoke();
		bocinaSony.radio();
		bocinaSony.apagar();
	}

}
