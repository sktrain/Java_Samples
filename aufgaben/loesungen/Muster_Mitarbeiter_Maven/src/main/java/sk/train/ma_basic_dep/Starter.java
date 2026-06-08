package sk.train.ma_basic_dep;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Starter {

	public static void main(String[] args) {

      Mitarbeiter m1 ;
      
      m1 = new Mitarbeiter( "Stephan", "Karrer", LocalDate.of(1959,8, 14),
    		                LocalDate.of(2015, 1, 1), new BigDecimal(5000));
      
      
      
      System.out.println(m1);
      
      Mitarbeiter abtleiter = new Mitarbeiter( "Max", "Abteilungsleiter", LocalDate.of(1970, 1, 25),
              LocalDate.of(2015, 1, 1), new BigDecimal(8000));
      
      Abteilung abt = new Abteilung(abtleiter, "Testabteilung","IT");
      
      System.out.println(abt);
      
      //abtleiter.setAbt(abt); //?
      
      m1.setAbt(abt);
      
      System.out.println(m1);
      
      
      

	}

}







