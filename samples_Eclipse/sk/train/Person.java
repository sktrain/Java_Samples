package sk.train;

import java.time.LocalDate;

public class Person {
	
	private String vorname = "Erika";
	private String nachname = "Musterfrau";
	private LocalDate gebdatum = LocalDate.of(2000, 1, 1) ;
	private Gender geschlecht = Gender.W;
	
//	public Person() {
//		super();
//	}

	public Person(String vorname, String nachname, LocalDate gebdatum, Gender geschlecht) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebdatum = gebdatum;
		this.geschlecht = geschlecht;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Gender getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Gender geschlecht) {
		this.geschlecht = geschlecht;
	}

	public LocalDate getGebdatum() {
		return gebdatum;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", gebdatum=" + gebdatum + ", geschlecht="
				+ geschlecht + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gebdatum == null) ? 0 : gebdatum.hashCode());
		result = prime * result + ((geschlecht == null) ? 0 : geschlecht.hashCode());
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
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
		Person other = (Person) obj;
		if (gebdatum == null) {
			if (other.gebdatum != null)
				return false;
		} else if (!gebdatum.equals(other.gebdatum))
			return false;
		if (geschlecht != other.geschlecht)
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
	
	

}
