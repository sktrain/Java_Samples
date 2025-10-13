package sk.train;

import java.util.Scanner;

public class IsFakultaet {

	public static void main(String[] args) {
		
		//Einlesen der Zahl via Utility-Klasse Scanner
		System.out.println("Bitte positive Ganzzahl eingeben:");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		//Prüfen ob Fakultaet
		for (int i = 2; i<=num; ++i) {
			System.out.println(num + " : " + i);
			if (num % i == 0 ) {
				num = num/i;
				if(num == 1) {
					System.out.println("Zahl ist Fakultaet von: " + i);
					break;
				}
			} else {
				System.out.println("Zahl ist keine Fakultaet");
				break;
			}
		}

	}

}
