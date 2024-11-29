package sk.train;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonHaufen {
	
	private Person[] parray;
	
	private ArrayList<Person> plist;
	
	public PersonHaufen() {
		parray = new Person[100];
		for (int i = 0; i < parray.length; i++) {
			if(i%2 == 0) {
				Person p = new Person("Erika", "Musterfrau" + i, 
						LocalDate.of(2020, 1 + (int)Math.random()*12, 1), Gender.W );
				parray[i] = p;
				plist.add(p);
			} else {
				Person p = new Person("Max", "Mustermann" + i, 
						LocalDate.of(2020, 1 + (int)Math.random()*12, 1), Gender.M );
				parray[i] = p;
				plist.add(p);
			}				
		}		
	}

	@Override
	public String toString() {
		
		String s ="";
		for (Person p : plist) {
			s = s + "\n" + p;
		}
		return "PersonHaufen: " + s;
	}
	
	
	

}
