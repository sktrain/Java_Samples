/*
 * 
 */

package sk.train;

import java.math.BigDecimal;

public class First {

	public static void main(String[] args) { // hier gehts los

		int x = 1;
		int y = 2;
		double r = 2.5;
		
		System.out.println("<svg height=\"100\" width=\"1000\">");
		System.out.println("\t\"<circle cx=" +x + " cy=" + y + " r=" + r +" />");
		System.out.println("</svg>");
		
		System.out.println(
				"""
				<svg height="100" width="1000">
					<circle cx="100" cy="110" r="20.5" />
				</svg>
				""");
		
		for(;;) {
			System.out.println("Schleife");
		}
	}
}
