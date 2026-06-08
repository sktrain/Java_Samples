/* Ergänzung der Mitarbeiterverwaltung um Möglichkeiten der Speicherung
 * via Objekt-Serialisierung
 */


package sk.train.ma_verwaltung_serialisierbar;

public class Starter {

	public static void main(String[] args) {

		MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();
		
		Mitarbeiter[] marray1 = mv.getMarray();
		System.out.println(marray1);

		
		//Serialisierung nutzen
		
		//Speichern
		mv.store("mliste.ser");
		
		//Laden
		mv.load("mliste.ser");
		
		Mitarbeiter[] marray2 = mv.getMarray();
		System.out.println(marray2);
		System.out.println(marray1 == marray2);
		
		//for (Mitarbeiter m : marray2) System.out.println(m);
		 
	}

}
