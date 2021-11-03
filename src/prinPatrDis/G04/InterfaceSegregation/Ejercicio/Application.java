package prinPatrDis.G04.InterfaceSegregation.Ejercicio;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BocinaBose bocinaBose = new BocinaBose("BS-TY-88");
		BocinaSamsung bocinaSamsung = new BocinaSamsung("SM-SF-852");
		BocinaSony bocinaSony = new BocinaSony("SRS-X-99");
		
		bocinaBose.encender();
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
		bocinaSony.apagar();
	}

}
