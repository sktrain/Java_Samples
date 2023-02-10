package sk.train.ma;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Mitarbeiterverwaltung {

    private Mitarbeiter[] marray;
    private List<Mitarbeiter> mlist;

    private Map<Integer, Mitarbeiter> mmap;

    private BigDecimal gesumme;

    public Mitarbeiterverwaltung() throws Exception {
        marray = new Mitarbeiter[100];
        mlist = new ArrayList<>();
        mmap = new TreeMap<>();

        // 50/50 Fixgehalt/Arbeiter
        //Nachname varrieren z.B. Index anhängen
        //Gehälter und Geburtsdatum variieren
        new BigDecimal((int)(Math.random() *10000));
        Mitarbeiter m;
        for ( int i=0; i < marray.length; ++i){
            if (i%2 == 0) {  //Arbeiter
                m = new Arbeiter("Max", "Maulwurf" + i, i, LocalDate.of(1980, 1 + (int)(Math.random()*12), 1),
                        LocalDate.of(2000, 1 + (int)(Math.random()*11), 1), Geschlecht.M, new BigDecimal("100"), new BigDecimal((int)(Math.random()*100)));
            } else {
               m =  new FixGehaltMitarbeiter("Erika", "Musterfrau" + i, i, LocalDate.of(1980, 1 + (int)(Math.random()*11), 1),
                       LocalDate.of(2000, 1 + (int)(Math.random()*11), 1), new BigDecimal((int)(Math.random() *10000)), Geschlecht.W);
            }
            marray[i] = m;
            mlist.add(m);
            mmap.put(m.getPersnr(), m);
        }

    }

    public BigDecimal getGehaltssumme(){
        BigDecimal summe = BigDecimal.ZERO;
        for ( Mitarbeiter m : marray ) {
            summe = summe.add(m.getGehalt());
        }
        return summe;
    }

    public BigDecimal getGehaltsummeByMap(){
        //Berechnung anhand Map
        BigDecimal summe = BigDecimal.ZERO;
//        for ( Mitarbeiter m : mmap.values() ) {
//            summe = summe.add(m.getGehalt());
//        }
        Set<Integer> ks = mmap.keySet();
        for ( Integer i : ks ) {
            summe = summe.add(mmap.get(i).getGehalt());
        }
        return summe;
    }

    public List<BigDecimal> getGehaltsummeByList(){
        List<BigDecimal> summenlist = new ArrayList<>();

        //klassische Variante mit foreach-Schleife
        BigDecimal summe = BigDecimal.ZERO;
        for ( Mitarbeiter m : mlist ) {
            summe = summe.add(m.getGehalt());
        }
        summenlist.add(summe);

        //Variante mit Lambda, muss aufgrund Seiteneffekt Datenattribut für Summe nutzen
        gesumme = BigDecimal.ZERO;
        mlist.forEach( m ->  gesumme = gesumme.add(m.getGehalt()));
        summenlist.add(gesumme);

        //alternativ per Stream-reduce
        summe = mlist.stream().reduce(BigDecimal.ZERO, (BigDecimal bisher, Mitarbeiter m) -> bisher = bisher.add(m.getGehalt()), (BigDecimal b1, BigDecimal b2) -> b1.add(b2));
        summenlist.add(summe);

        //alternativ per Stream mit unkomplizierten reduce
        summe = mlist.stream().map(Mitarbeiter::getGehalt).reduce(BigDecimal.ZERO, BigDecimal::add);
        summenlist.add(summe);

        return summenlist;

    }
    public Mitarbeiter[] getMarray(){
        return marray;
    }
}
