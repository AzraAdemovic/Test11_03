package petiZadatak;

import java.util.Scanner;

public class MyArrayRun {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		int[] brojevi = new int [10];
		MyArray array = new MyArray(brojevi);
		System.out.println("Molimo unesite 10 cijelih brojeva :");
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = unos.nextInt();
	}
		unos.close();
		System.out.println("Najveæi broj u nizu je: " + array.najveciElement(brojevi) );
		System.out.println("Najmanji broj u nizu je : " + array.najmanjiElement(brojevi));
		System.out.println("Suma brojeva :" + array.suma(brojevi));
		System.out.println("Svi brojevi u nizu : " );
		array.ispisiElemente();
 
}
}
