package sk.train;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonVerwaltung {
	
	private ArrayList<Person> personlist;
	
	public PersonVerwaltung() {
		personlist = new ArrayList<>();
		for (int i = 0; i < 100; ++i) {
			LocalDate l = LocalDate.of(2025,1 + (int)(Math.random()*12), 1);
			Person p = new Person("Muster"+i, l, (int) (Math.random()*5000) );
			personlist.add(p);
		}
	}

	public ArrayList<Person> getPersonlist() {
		return personlist;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((personlist == null) ? 0 : personlist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVerwaltung other = (PersonVerwaltung) obj;
		if (personlist == null) {
			if (other.personlist != null)
				return false;
		} else if (!personlist.equals(other.personlist))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for (Person p : personlist) {
			sb.append(p).append("\n");
		}
		return sb.toString();
	}

}
