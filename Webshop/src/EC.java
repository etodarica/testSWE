
public class EC implements Onlinezahlung {

	public EC() {
		super();
	}
	//Testkommentar
	//Würde ich anders machen
	@Override
	public void erzeugeZahlung() {
		System.out.println("Zahlungsmethode EC.");
	}

}
