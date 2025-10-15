package sk.train;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Person {
	
	private String name = "Max";
	private LocalDate gebdatum = LocalDate.now();
	private int pernr = 0;
	
		
	public Person() {
		super();
	}

	public  Person(String name, LocalDate gebdatum, int pernr) {
		super();
		this.name = name;
		this.gebdatum = gebdatum;
		if (pernr <0 ) throw 
		(new InvalidParameterException
				("negative persnummern nicht erlaubt"));
		this.pernr = pernr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getGebdatum() {
		return gebdatum;
	}

	public void setGebdatum(LocalDate gebdatum) {
		this.gebdatum = gebdatum;
	}

	public int getPernr() {
		return pernr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gebdatum=" + gebdatum + ", pernr=" + pernr + "]  " + super.toString() ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gebdatum == null) ? 0 : gebdatum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pernr;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pernr != other.pernr)
			return false;
		return true;
	}
	
	

}
