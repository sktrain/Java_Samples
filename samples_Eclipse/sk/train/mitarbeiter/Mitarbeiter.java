package sk.train.mitarbeiter;

import java.math.BigDecimal;
import java.time.LocalDate;

import sk.train.Gender;

public class Mitarbeiter {
	
	private int id = 1;
	private String vorname;
	private String nachname;
	private LocalDate gebdatum;
	private LocalDate einstdatum;
	private Gender geschlecht;
	private BigDecimal gehalt;
	
	
	public Mitarbeiter(int id, String vorname, String nachname, LocalDate gebdatum, LocalDate einstdatum,
			Gender geschlecht, BigDecimal gehalt) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebdatum = gebdatum;
		this.einstdatum = einstdatum;
		this.geschlecht = geschlecht;
		this.gehalt = gehalt;
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
	public BigDecimal getGehalt() {
		return gehalt;
	}
	public void setGehalt(BigDecimal gehalt) {
		this.gehalt = gehalt;
	}
	public int getId() {
		return id;
	}
	public LocalDate getGebdatum() {
		return gebdatum;
	}
	public LocalDate getEinstdatum() {
		return einstdatum;
	}
	
	@Override
	public String toString() {
		return "Mitarbeiter [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + ", gebdatum=" + gebdatum
				+ ", einstdatum=" + einstdatum + ", geschlecht=" + geschlecht + ", gehalt=" + gehalt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((einstdatum == null) ? 0 : einstdatum.hashCode());
		result = prime * result + ((gebdatum == null) ? 0 : gebdatum.hashCode());
		result = prime * result + ((gehalt == null) ? 0 : gehalt.hashCode());
		result = prime * result + ((geschlecht == null) ? 0 : geschlecht.hashCode());
		result = prime * result + id;
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
		Mitarbeiter other = (Mitarbeiter) obj;
		if (einstdatum == null) {
			if (other.einstdatum != null)
				return false;
		} else if (!einstdatum.equals(other.einstdatum))
			return false;
		if (gebdatum == null) {
			if (other.gebdatum != null)
				return false;
		} else if (!gebdatum.equals(other.gebdatum))
			return false;
		if (gehalt == null) {
			if (other.gehalt != null)
				return false;
		} else if (!gehalt.equals(other.gehalt))
			return false;
		if (geschlecht != other.geschlecht)
			return false;
		if (id != other.id)
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
