package sk.train;

import java.util.Scanner;

public class BeuteFair_132 {
	
	public static void main(String[] args) {
		
		//weniger schön, da wir Scanner nicht schließen --> Warning
		//int anzahl = new Scanner(System.in).nextInt();
		
		
		//Anzahl Flaschen einlesen
		System.out.println("Number of Bottles?");
		Scanner s = new Scanner(System.in);
		int anzahl = s.nextInt();
		
		//jetzt eigentliche Aufgabe
		System.out.println("Total number of bottles: " + anzahl);
		System.out.println("Bottles for Captain: " + anzahl/2);
		System.out.println("Bottles for Crew: " + (anzahl - anzahl/2));
		
		//Anzahl Crew-Mitglieder
		System.out.println("Number of crew members?");
		int crewcount = s.nextInt();
		
		Boolean isfair = (anzahl - anzahl/2) % crewcount == 0;
		System.out.println("Fair share: " + isfair);
		
		//sollten wir machen
		s.close();		
		
	}
	
	
	

}
