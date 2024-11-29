package sk.train.mitarbeiter;

import java.math.BigDecimal;
import java.time.LocalDate;

import sk.train.Gender;

public class MitarbeiterTest {

	public static void main(String[] args) {

       Mitarbeiter m = new Mitarbeiter(1, "Stephan", "Karrer", LocalDate.of(1970, 1, 1), 
    		                            LocalDate.of(2020,1,1), Gender.M, new BigDecimal("5000"));
       
       Mitarbeiter m1 = new Mitarbeiter(1, "Stephan", "Karrer", LocalDate.of(1970, 1, 1), 
               LocalDate.of(2020,1,1), Gender.M, new BigDecimal("5000"));
       
       System.out.println(m);
       System.out.println(m1);
       
       System.out.println(m1 == m);
       
       m1 = m;
       
       System.out.println(m1 == m);
       
       m.setNachname("Mustermann");
       
       System.out.println(m1.getNachname());
       
       
       
       
       
       
       
       
//       System.out.println(m.getGehalt());
//       
//       System.out.println(m);

	}

}
