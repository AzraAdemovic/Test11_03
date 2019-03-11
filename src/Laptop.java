
public class Laptop extends Racunar {

	double trajanjeBAterije;

	public Laptop(int kolicinaRAMa, int kapacitetHD, double dijagonalaMonitora, double nabavnaCijena,
			double trajanjeBAterije, double brzinaProcesora) {
		super(kolicinaRAMa, kapacitetHD, dijagonalaMonitora, nabavnaCijena, brzinaProcesora);
		this.trajanjeBAterije = trajanjeBAterije;
	}

	Racunar racunar = new Racunar(64, 15, 2.5, 550, 9.2);

	public static void izracunajCijenuLaptopa() {
		
		double cijenaLaptopa = Racunar.getNabavnaCijena() + (Racunar.getNabavnaCijena() / 100) * 15;
		System.out.println(cijenaLaptopa);

	}

}
