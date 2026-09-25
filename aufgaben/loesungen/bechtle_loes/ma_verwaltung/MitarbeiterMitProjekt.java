package sk.train.ma_verwaltung;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MitarbeiterMitProjekt extends Mitarbeiter {
	
	private Project p;

	public MitarbeiterMitProjekt(String vorname, String nachname, LocalDate gebdatum, LocalDate einstdatum,
			BigDecimal gehalt, Geschlecht geschlecht, Project p) {
		super(vorname, nachname, gebdatum, einstdatum, gehalt, geschlecht);
		this.p = p;
	}

	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "MitarbeiterMitProjekt [p=" + p + ", getVorname()=" + getVorname() + ", getNachname()=" + getNachname()
				+ ", getPersnr()=" + getPersnr() + ", getGebdatum()=" + getGebdatum() + ", getEinstdatum()="
				+ getEinstdatum() + ", getGehalt()=" + getGehalt() + ", getGes()=" + getGes() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((p == null) ? 0 : p.hashCode());
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
		MitarbeiterMitProjekt other = (MitarbeiterMitProjekt) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}
	
	
	
	

}
