package sk.train;

import java.util.Scanner;

public class GleicheZiffern_133 {

	public static void main(String[] args) {
		
		//Einlesen der Zahlen via Utility-Klasse Scanner
		System.out.println("Bitte 2 positive Ganzzahlen eingeben:");
		
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		//eigentliche Arbeit
		
		int lastdigits1 = num1%100;  //nur die letzten beiden Ziffern!
		int lastdigits2 = num2%100;	 //nur die letzten beiden Ziffern!
		
		//nur zur Prüfung
		System.out.println(lastdigits1 + " : " + lastdigits2);
		
		int digit11 = lastdigits1/10;
		int digit12 = lastdigits1%10;
		
		//nur zur Prüfung
		System.out.println(digit11 + " : " + digit12);
		
		int digit21 = lastdigits2/10;
		int digit22 = lastdigits2%10;
		
		boolean result = (digit11 == digit21 || digit11 == digit22 || digit12 == digit21 || digit12 == digit22);
		System.out.println("Gleiche Ziffern: " + result);
		
		//mit optionaler Ausgabe der gleichen Ziffern:
		if (digit11 == digit21 || digit11 == digit22) {
			System.out.println("Gemeinsame Ziffer: " + digit11);
		}
		if (digit12 == digit21 || digit12 == digit22 ) {
			System.out.println("Gemeinsame Ziffer: " + digit12);
		}
		
	}

}
