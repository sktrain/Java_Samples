package sk.train;

import java.time.LocalDate;

public class PersonNutzer {

	public static void main(String[] args) {

          Person p = new Person("Max", "Mustermann", LocalDate.now(), Gender.M);
          //System.out.println(p.nachname);
          System.out.println(p);
          
          SimpleMitarbeiter sm = new SimpleMitarbeiter(
        		  "Max", "Mustermann", LocalDate.now(), Gender.M, 5000);
          System.out.println(sm);
	}

}
