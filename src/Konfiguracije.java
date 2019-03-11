import java.util.Scanner;

public class Konfiguracije {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.println(
				"Molimo odaberite \n 1 ukoliko želite specifikacije raèunara \n 2 ukoliko želite specifikacije laptopa");
		int odabir = unos.nextInt();
		switch (odabir) {
		case 1:
			ispisiKonfiguracijeRacunara();
			break;
		case 2:
			ispisiKonfiguracijeLaptopa();
			break;
		default:
			System.out.println("Odaberite jedan od ponuðenih brojeva.");
			break;
		}
		unos.close();

	}

	public static void konfiguracije() {
		Racunar racunar = new Racunar(64, 15, 2.5, 550, 9.2);

		System.out.println("Konfiguracije raèunara su: ");
		System.out.println();
		System.out.println("Kolièina RAM memorije raèunara iznosi :  " + racunar.getKolicinaRAMa() + " GB.");
		System.out.println("Kapacitet hard diska iznosi : " + racunar.getKapacitetHD() + "GB.");
		System.out.println("Brzina procesora iznosi : " + racunar.getBrzinaProcesora() + "GHz.");
		System.out.println("Dijagonala monitora iznosi : " + racunar.getDijagonalaMonitora() + "Inch-a.");
		System.out.println("Cijena ureðaja iznosi ");
	}

	public static void ispisiKonfiguracijeRacunara() {
		konfiguracije();
		Racunar.izracunajCijenu();

	}

	public static void ispisiKonfiguracijeLaptopa() {
		Laptop laptop = new Laptop(64, 15, 2.5, 550, 5.0, 9.2);
		System.out.println("Trajanje baterije iznosi  : " + laptop.trajanjeBAterije + "h.");
		konfiguracije();
		Laptop.izracunajCijenuLaptopa();

	}

}
