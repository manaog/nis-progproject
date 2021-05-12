package de.unidue.iem.tdr.nis.client.solutions;

public class Helper {
	/** Hier können Sie ihre allgemeinen Funktionen erstellen,
	 * welche in allen Lösungen verfügbar sind.
	 * Sie können auch statische Methoden oder Subklassen benutzen.
	 * Sie können jedoch NICHT die Signatur des Konstruktors verändern.
	 */
	public Helper() {
		
	}
	
	public String mod(int a, int b) {
		String ausgabe;
		double z;
		int x = a/b;
		double y = (double) a / (double) b;
		
		if((double) x==y) {
			return "0";
		} else {
			z=y-x;
			z=z*b;
		}
		ausgabe = Integer.toString((int) z);
		return ausgabe;
	}
	
	public String hexToDec(String input) {
		String ausgabe;
		int a=0;
		int b=1;
		for(int i=input.length()-1;i>=0;i--) {
			int hex = 0;
			switch(input.toUpperCase().charAt(i)) {
			case 'F':
				hex = 15;
				break;
			case 'E':
				hex = 14;
				break;
			case 'D':
				hex = 13;
				break;
			case 'C':
				hex = 12;
				break;
			case 'B':
				hex = 11;
				break;
			case 'A':
				hex = 10;
				break;
			default:
				hex = Integer.parseInt(input.charAt(i) + "");
			}
			a = a + (hex * b);
			b= b*16;
		}
		ausgabe = Integer.toString(a);
		return ausgabe;
	}
	
	public String decToBin(String input) {
		String ausgabe= "";
		int dec = Integer.parseInt(input);
		while(dec!=0) {
			ausgabe = this.mod(dec, 2) + ausgabe;
			dec = dec/2;
		}
		return ausgabe;
	}
	
	public String hexToBin(String hex) {
		String dec = hexToDec(hex);
		String ausgabe = decToBin(dec);
		return ausgabe;
	}
}
