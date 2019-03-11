package treciZadatak;

import java.util.Scanner;

public class PredzadnjaRijec {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite recenicu:");
		String recenica = unos.nextLine();
		String rijec []= recenica.split(" ");
		System.out.println(rijec[rijec.length-2]);
		unos.close();

	}

}
