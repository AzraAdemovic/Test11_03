
public class Racunar {

	protected int kolicinaRAMa;
	int kapacitetHD;
	double dijagonalaMonitora;
	static double nabavnaCijena;
	double brzinaProcesora;

	public Racunar(int kolicinaRAMa, int kapacitetHD, double dijagonalaMonitora, double nabavnaCijena,
			double brzinaProcesora) {
		super();
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.dijagonalaMonitora = dijagonalaMonitora;
		Racunar.nabavnaCijena = nabavnaCijena;
	}

	public int getKolicinaRAMa() {
		return kolicinaRAMa;
	}

	public void setKolicinaRAMa(int kolicinaRAMa) {
		this.kolicinaRAMa = kolicinaRAMa;
	}

	public int getKapacitetHD() {
		return kapacitetHD;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public void setKapacitetHD(int kapacitetHD) {
		this.kapacitetHD = kapacitetHD;
	}

	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}

	public void setDijagonalaMonitora(double dijagonalaMonitora) {
		this.dijagonalaMonitora = dijagonalaMonitora;
	}

	public static double getNabavnaCijena() {
		return nabavnaCijena;
	}

	public void setNabavnaCijena(double nabavnaCijena) {
		Racunar.nabavnaCijena = nabavnaCijena;
	}

	public static void izracunajCijenu() {
		
		double cijenaRacunara = (nabavnaCijena + (nabavnaCijena / 100) * 10);
		System.out.println(cijenaRacunara);

	}

}
