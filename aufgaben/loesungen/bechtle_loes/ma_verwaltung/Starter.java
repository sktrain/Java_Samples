
package sk.train.ma_verwaltung;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Starter {

	public static void main(String[] args) {

      //mitarbeiterTest();
	  verwaltungTest();

	}
	
	private static void verwaltungTest() {
		MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();
		System.out.println(mv);
		System.out.println("\n***************************************************************\n");
		System.out.println(mv.getGehaltssumme());
		System.out.println("\n***************************************************************\n");
		System.out.println(mv.getMlist().size());
	}

	private static void mitarbeiterTest() {
		Mitarbeiter m1 ;
		  
		  m1 = new Mitarbeiter( "Stephan", 
				                "Karrer", 
				                LocalDate.of(1969,8, 14),
				                LocalDate.of(2015, 1, 1), 
				                new BigDecimal(5000));
		  
		  Mitarbeiter m2 = new MitarbeiterMitProjekt( "Stephan", 
				                                      "Karrer", 
				                                      LocalDate.of(1969,8, 14),
				                                      LocalDate.of(2015, 1, 1), 
				                                      new BigDecimal(5000), 
				                                      Geschlecht.M,
				                                      new Project(LocalDate.now(), 10_000, 1));
		  
		  System.out.println(m1);
		  System.out.println(m2);
		  
		  System.out.println(m1 == m2);
		  System.out.println(m1.equals(m2));
		  
		  System.out.println(m1.getPersnr());
		  System.out.println(m2.getPersnr());
		  
		  System.out.println(m1.getGes());
		  System.out.println(m1.getGes().name());
		  
		  System.out.println(m2);
		  
		  System.out.println(((MitarbeiterMitProjekt) m2).getP());
		  
		  MitarbeiterMitProjekt mp = new MitarbeiterMitProjekt("Otto", 
				                                               "Mustermann", 
				                                               LocalDate.of(2000, 1, 1), 
				                                               LocalDate.of(2020,1,1), 
				                                               new BigDecimal("6000"), 
				                                               Geschlecht.D,
				                                               new Project(LocalDate.now(),20_000, 2));
		  
		  System.out.println(mp);
	}

}







