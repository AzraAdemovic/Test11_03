package drugiZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class UnosRijeci {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		ArrayList<String> words = new ArrayList<>();
		System.out.println("unesite rijeèi");
		String input = unos.next();
		do { 
		for (int i = 0; i< words.size(); i ++) {
		
			words.add(input);
		}
		} while (!(input.equals("kraj")));
		for (String string : words) {
			System.out.print(string + " ");
		}
		unos.close();
		
		
		
		
	}

}
