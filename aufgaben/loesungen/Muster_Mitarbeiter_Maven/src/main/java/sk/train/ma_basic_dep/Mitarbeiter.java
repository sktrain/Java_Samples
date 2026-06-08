package sk.train.ma_basic_dep;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Mitarbeiter {
	
	//statische Elemente
	private static int zaehler = 100000;
	
	//Datenattribute
	private String persnr;
	private String vorname;
	private String nachname;
	private LocalDate gebdatum;
	private LocalDate einstdatum;
	private BigDecimal gehalt;
	
	private Abteilung abt;  //null als default, sofern der Mitarbeiter keiner Abteilung angeh�ren muss
	private Geschlecht ges = Geschlecht.D;
	
	
	//Konstruktoren
	public Mitarbeiter(String vorname, String nachname, LocalDate gebdatum, 
			           LocalDate einstdatum, BigDecimal gehalt){
		super();
		this.persnr = "PO"+zaehler;
		++zaehler;
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebdatum = gebdatum;
		this.einstdatum = einstdatum;
		this.gehalt = gehalt;
		
	}
	
	public Mitarbeiter(String persnr, String vorname, String nachname, LocalDate gebdatum, 
			           LocalDate einstdatum) {
		this(vorname, nachname, gebdatum, einstdatum, new BigDecimal(2000));
	}
	
	


	public Mitarbeiter(String vorname, String nachname, LocalDate gebdatum, LocalDate einstdatum,
			BigDecimal gehalt, Abteilung abt, Geschlecht ges) {
		this(vorname, nachname, gebdatum, einstdatum, gehalt);
		this.abt = abt;
		this.ges = ges;
	}

	//Getter/Setter
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

	public String getPersnr() {
		return persnr;
	}

	public LocalDate getGebdatum() {
		return gebdatum;
	}

	public LocalDate getEinstdatum() {
		return einstdatum;
	}
	
	public BigDecimal getGehalt() {
		return gehalt;
	}
	
	public void setGehalt(BigDecimal gehalt) {
		this.gehalt = gehalt;
	}

	public Abteilung getAbt() {
		return abt;
	}

	public void setAbt(Abteilung abt) {
		this.abt = abt;
	}
	
	public Geschlecht getGes() {
		return ges;
	}

	public void setGes(Geschlecht ges) {
		this.ges = ges;
	}
	

}
