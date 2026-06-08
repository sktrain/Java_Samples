/* Mitarbeiter-L�sung erweitert um verschiedene Sortiervarianten:
 * Lambdas werden kurz eingef�hrt.
 */

package sk.train.ma_verwaltung_abstract_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Starter {

	public static void main(String[] args) {

		MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();

		printOrdered(mv);

		printNaturalOrder(mv);
		
		printSortedByName(mv);

		printSortedByName_Lambda(mv);

		printSortedByGebDatum(mv);

		printSortedByGebDatumAndGehalt(mv);

		printSortedByNaturalOrder(mv);
	}
	

	private static void printOrdered(MitarbeiterVerwaltung mv) {
		//Ausgabe in Füllreihenfolge, da Listen und Arrays die Ordnung beibehalten
		System.out.println(mv);   //vorausgesetzt entsprechende toString-Methode
		
		//selbstverständlich funktionieren auch direkten Schleifen 
		//for (Mitarbeiter m : mv.getMarray())
		//			System.out.println(m);
		//		System.out.println("\n***********************************\n");
		//for (Mitarbeiter m : mv.getMlist())
		//			System.out.println(m);
	}

	private static void printNaturalOrder(MitarbeiterVerwaltung mv) {
		// Jetzt nach Gehältern sortiert (natural order)
		System.out.println("\n***********Hier nach Gehalt sortiert**************\n");
		Arrays.sort(mv.getMarray());
		System.out.println(mv);
		
		//Collections.sort(mv.getMlist());
		//for (Mitarbeiter m : mv.getMlist())
		//System.out.println(m);
		}

	private static void printSortedByName(MitarbeiterVerwaltung mv) {
		// jetzt nach Nachnamen sortiert
		System.out.println("\n***********Hier nach Nachnamen sortiert**************\n");
		Arrays.sort(mv.getMarray(), new NachnamenComparator());
		System.out.println(mv);
	}

	private static void printSortedByName_Lambda(MitarbeiterVerwaltung mv) {
		System.out.println("\n***********Hier nach Nachnamen sortiert**************\n");
		// Alternativ als Lambda geschrieben
		Comparator<Mitarbeiter> namecomp = (Mitarbeiter arg0, Mitarbeiter arg1) -> {
											return arg0.getNachname().compareTo(arg1.getNachname());
											};
		Arrays.sort(mv.getMarray(), namecomp); 
		// oder verkürzt
		//Arrays.sort(mv.getMarray(), (arg0, arg1) -> arg0.getNachname().compareTo(arg1.getNachname()));
		System.out.println(mv);
	}
	
	private static void printSortedByGebDatum(MitarbeiterVerwaltung mv) {
		// jetzt mal nur per Lambda nach den Geburtsdaten und Ausgabe mit
		// foreach-Lambda-Version
		System.out.println("\n***********Hier nach Geburtsdatum sortiert**************\n");
		Comparator<Mitarbeiter> cgebdatum = (Mitarbeiter m1, Mitarbeiter m2) -> {
			return m1.getGebdatum().compareTo(m2.getGebdatum());
		};
		Arrays.sort(mv.getMarray(), cgebdatum);
		Arrays.asList(mv.getMarray()).forEach(m -> System.out.println(m));
		//oder als Methodenreferenz
		//Arrays.asList(mv.getMarray()).forEach(System.out::println);
	}
	
	private static void printSortedByGebDatumAndGehalt(MitarbeiterVerwaltung mv) {
		// und jetzt mal zuerst nach den Geburtsdaten und dann nachsortiert anhand der Gehälter
		System.out.println("\n******Hier nach Geburtsdatum und Gehalt sortiert************\n");
		Comparator<Mitarbeiter> cgebdatum = (Mitarbeiter m1, Mitarbeiter m2) -> {
			return m1.getGebdatum().compareTo(m2.getGebdatum());
		};
		Comparator<Mitarbeiter> cgehalt = (Mitarbeiter m1, Mitarbeiter m2) -> {
			return m1.getGehalt().compareTo(m2.getGehalt());
		};
		Arrays.sort(mv.getMarray(), cgebdatum.thenComparing(cgehalt));
		Arrays.asList(mv.getMarray()).forEach(System.out::println);
	}
	
	private static void printSortedByNaturalOrder(MitarbeiterVerwaltung mv) {
		// und jetzt mal zurück zur natürlichen Ordnung
		System.out.println("\n************ Back to Natural Order ***********************\n");
		Arrays.sort(mv.getMarray(), Comparator.naturalOrder());
		Arrays.asList(mv.getMarray()).forEach(System.out::println);
	}

}
