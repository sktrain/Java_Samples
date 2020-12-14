package sk.train;

public class Berechnung {

	public static void main(String[] args) {
		fakultaet(-5);
		for (int i = 1; i < 21; i++) {
			int erg = fakultaet(i);
			System.out.println("Fakultaet von " + i + " ist: " + erg);
			erg = fakultaetWhile(i);
			System.out.println("Fakultaet von " + i + " ist: " + erg);
			erg = fakultaetRek(i);
			System.out.println("Fakultaet von " + i + " ist: " + erg);
		}
	}
	
	public static int gaussSumme(int n) {
		int ergebnis = n * (n+1)/2;
		return ergebnis;
	}
	
	public static int fakultaet(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("hier nur positive Ganzzahl erlaubt");
		}
		int erg = 1;
		for ( int i = 1; i <=n; i=i+1) {
			erg = erg * i;
		}		
		return erg;
	}
	
	public static int fakultaetWhile(int n) {
		int erg = 1; int i = 1;
		while (i <= n) {
			erg = erg * i;
			i = i+1;
		}
		return erg;
	}
	
	public static int fakultaetRek(int n) {
		if (n == 1) return 1;
		else return n * fakultaetRek(--n);
	}
	
	
	

}
