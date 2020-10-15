package esercitazione;

public class Motocycle extends Vehicle {
	
	private int cilindrata;

	public Motocycle(String targa, String marca, String modello, boolean guasto, int cilindrata) {
		super(targa, marca, modello, guasto);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
}
