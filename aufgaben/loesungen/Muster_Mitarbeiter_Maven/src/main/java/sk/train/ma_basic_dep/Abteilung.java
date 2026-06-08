package sk.train.ma_basic_dep;

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

}
