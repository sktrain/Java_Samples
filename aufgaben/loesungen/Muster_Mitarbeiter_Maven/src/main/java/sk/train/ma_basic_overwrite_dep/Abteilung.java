package sk.train.ma_basic_overwrite_dep;

public class Abteilung {
	
	private Mitarbeiter abtleiter;
	private String abtname;
	private String bereich;
	
	public Abteilung(Mitarbeiter abtleiter, String abtname, String bereich) {
		super();
		this.abtleiter = abtleiter;
		this.abtname = abtname;
		this.bereich = bereich;
	}

	public Mitarbeiter getAbtleiter() {
		return abtleiter;
	}

	public void setAbtleiter(Mitarbeiter abtleiter) {
		this.abtleiter = abtleiter;
	}

	public String getAbtname() {
		return abtname;
	}

	public void setAbtname(String abtname) {
		this.abtname = abtname;
	}

	public String getBereich() {
		return bereich;
	}

	public void setBereich(String bereich) {
		this.bereich = bereich;
	}
	
	

	//Standardmethoden
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abtleiter == null) ? 0 : abtleiter.getPersnr().hashCode()); //Zyklus verhindern
		result = prime * result + ((abtname == null) ? 0 : abtname.hashCode());
		result = prime * result + ((bereich == null) ? 0 : bereich.hashCode());
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
		Abteilung other = (Abteilung) obj;
		if (abtleiter == null) {
			if (other.abtleiter != null)
				return false;
		} else if (!abtleiter.getPersnr().equals(other.abtleiter.getPersnr()))  //Zyklus verhindern
			return false;
		if (abtname == null) {
			if (other.abtname != null)
				return false;
		} else if (!abtname.equals(other.abtname))
			return false;
		if (bereich == null) {
			if (other.bereich != null)
				return false;
		} else if (!bereich.equals(other.bereich))
			return false;
		return true;
	}

	@Override   
	public String toString() {
		return "Abteilung [abtleiter=" + abtleiter.getPersnr() + " : " + abtleiter.getNachname()  //Zyklus verhindern
		                   + ", abtname=" + abtname + ", bereich=" + bereich + "]";
	}
	
	
}
