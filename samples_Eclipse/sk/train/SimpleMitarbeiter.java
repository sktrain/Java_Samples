package sk.train;

import java.time.LocalDate;

public class SimpleMitarbeiter extends Person{
	
	private int gehalt;

	public SimpleMitarbeiter(String vorname, String nachname, LocalDate gebdatum, Gender geschlecht, 
			                 int gehalt) {
		super(vorname, nachname, gebdatum, geschlecht);
		this.gehalt = gehalt;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		return "SimpleMitarbeiter [gehalt=" + gehalt + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + gehalt;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleMitarbeiter other = (SimpleMitarbeiter) obj;
		if (gehalt != other.gehalt)
			return false;
		return true;
	}

	

	
	
	

}
