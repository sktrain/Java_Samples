package sk.train;

import java.math.BigInteger;

public class Fakuktaet {

	public static void main(String[] args) {
		
		Fakuktaet f = new Fakuktaet();
		for (int i = 0; i<120; ++i) {
			System.out.println("Fuer: " + i + " ist die Fak: " + f.fakBig(i));
		}

	}
	
	static Fakuktaet getInstance () {
		//if ...
		return new Fakuktaet();
	}
	
	private Fakuktaet() {
		
	}
	
	public static int fak(int n) {

			int erg = 1;
			for (int i = 1; i<=n; ++i ) {
				erg = erg * i;
			}
	return erg;
	 }
	
	
	public  BigInteger fakBig(int n) {

		if (n <= 0) {
			throw new ArithmeticException("nur positive Ganzzahlen erlaubt");
		}
		//int erg = 1;
		BigInteger erg = BigInteger.ONE;
		for (int i = 1; i<=n; ++i ) {
			//erg = erg * i;
			erg = erg.multiply(new BigInteger(""+i));
			
		}
			return erg;
 }
	
	public static int fakwhile(int n) {
		
		int erg = 1;
		int i = 1;
		while(i <= n) {
			erg = erg * i;
			++i;
		}
		return erg;
	
	}
	
	public static int fakdo(int n) {
		
		int erg = 1;
		int i = 1;
		do {
			erg = erg * i;
			++i;
		} while (i <= n);
		return erg;	
	}
	
	
	public static int fakrek(int n) {
		
		if (n == 1) return 1;
		else return n * fakrek(--n);
	}
	

}











