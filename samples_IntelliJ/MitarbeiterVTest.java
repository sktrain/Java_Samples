package sk.train.ma;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class MitarbeiterVTest
{
    public static void main(String[] args) throws Exception {
        Mitarbeiterverwaltung mv = new Mitarbeiterverwaltung();

        System.out.println(mv.getGehaltssumme());

        System.out.println(mv.getGehaltsummeByList());


        try (BufferedWriter file = new BufferedWriter(new FileWriter("Mitarbeiter.txt"))) {

            for (Mitarbeiter m : mv.getMarray()) {
                file.write(m.toString());
                file.write(System.lineSeparator());
            }
            file.flush();
        }

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream ("test.ser"))) {
            os.writeObject("Hallo");
            os.writeObject(2);
            os.writeObject(mv.getMarray()[0]);
        }

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream( "test.ser"))) {
            String s = (String) is.readObject();
            is.readObject();
            Mitarbeiter m = (Mitarbeiter) is.readObject();
            System.out.println(m == mv.getMarray()[0]);
            System.out.println(m.equals(mv.getMarray()[0]));
        }




//        System.out.println("\n ***************************************************************** \n");
//
//        Mitarbeiter[] ma = mv.getMarray();
//
//        for (  Mitarbeiter m : ma) {
//            System.out.println(m);
//        }
//
//        Mitarbeiter m1 = ma[0];
//        Mitarbeiter m2 = ma[1];
//
//        System.out.println("\n ***************************************************************** \n");
//        System.out.println( m1 + "\n" + m2);
//        System.out.println(m1.compareTo(m2));
//
//        System.out.println("\n ***************************************************************** \n");
//
//        Arrays.sort(ma);
//        for (  Mitarbeiter m : ma) {
//            System.out.println(m);
//        }
//
//        System.out.println("\n ***************************************************************** \n");
//
//        Comparator<Mitarbeiter> namenscomp = (Mitarbeiter m01 , Mitarbeiter m02) -> m01.getNachname().compareTo(m02.getNachname());
//        namenscomp = Comparator.comparing( (Mitarbeiter m03 ) ->  m03.getNachname(), (String s1 , String s2) -> s1.length()-s2.length());
//
//        Comparator<Arbeiter> nca = Comparator.comparing( Mitarbeiter::getNachname);
//
//        //Arrays.sort(ma, Comparator.comparing(Mitarbeiter::getNachname));
//        Arrays.sort(ma, namenscomp);
//        for (  Mitarbeiter m : ma) {
//            System.out.println(m);
//        }

//        System.out.println("\n ***************************************************************** \n");
//        Arrays.sort(ma, MitarbeiterVTest::compare);
//        for (  Mitarbeiter m : ma) {
//            System.out.println(m);
//        }

    }

    private static int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return o1.getGebdatum().compareTo(o2.getGebdatum());
    }
}
