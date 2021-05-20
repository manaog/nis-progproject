package de.unidue.iem.tdr.nis.client.solutions;

public class Helper {
	/** Hier können Sie ihre allgemeinen Funktionen erstellen,
	 * welche in allen Lösungen verfügbar sind.
	 * Sie können auch statische Methoden oder Subklassen benutzen.
	 * Sie können jedoch NICHT die Signatur des Konstruktors verändern.
	 */
	
	
	public Helper() {
		
	}
	
	public int vigAt(char input) {
		int output = 0;
		switch(input) {
		case 'A': 
			output = 0;
			break;
		case 'B':
			output = 1;
			break;
		case 'C':
			output = 2;
			break;
		case 'D':
			output = 3;
			break;
		case 'E':
			output = 4;
			break;
		case 'F':
			output = 5;
			break;
		case 'G':
			output = 6;
			break;
		case 'H':
			output = 7;
			break;
		case 'I':
			output = 8;
			break;
		case 'J':
			output = 9;
			break;
		case 'K':
			output = 10;
			break;
		case 'L':
			output = 11;
			break;
		case 'M':
			output = 12;
			break;
		case 'N':
			output = 13;
			break;
		case 'O':
			output = 14;
			break;
		case 'P':
			output = 15;
			break;
		case 'Q':
			output = 16;
			break;
		case 'R':
			output = 17;
			break;
		case 'S':
			output = 18;
			break;
		case 'T':
			output = 19;
			break;
		case 'U':
			output = 20;
			break;
		case 'V':
			output = 21;
			break;
		case 'W':
			output = 22;
			break;
		case 'X':
			output = 23;
			break;
		case 'Y':
			output = 24;
			break;
		case 'Z':
			output = 25;
			break;
		}
		return output;
	}
	
	public char[] fillVig() {
		char[] vig= new char[26];
		for(int i=0;i<26;i++) {
				switch(i) {
				case 0:
					vig[i]='A';
					break;
				case 1:
					vig[i]='B';
					break;
				case 2:
					vig[i]='C';
					break;
				case 3:
					vig[i]='D';
					break;
				case 4:
					vig[i]='E';
					break;
				case 5:
					vig[i]='F';
					break;
				case 6:
					vig[i]='G';
					break;
				case 7:
					vig[i]='H';
					break;
				case 8:
					vig[i]='I';
					break;
				case 9:
					vig[i]='J';
					break;
				case 10:
					vig[i]='K';
					break;
				case 11:
					vig[i]='L';
					break;
				case 12:
					vig[i]='M';
					break;
				case 13:
					vig[i]='N';
					break;
				case 14:
					vig[i]='O';
					break;
				case 15:
					vig[i]='P';
					break;
				case 16:
					vig[i]='Q';
					break;
				case 17:
					vig[i]='R';
					break;
				case 18:
					vig[i]='S';
					break;
				case 19:
					vig[i]='T';
					break;
				case 20:
					vig[i]='U';
					break;
				case 21:
					vig[i]='V';
					break;
				case 22:
					vig[i]='W';
					break;
				case 23:
					vig[i]='X';
					break;
				case 24:
					vig[i]='Y';
					break;
				case 25:
					vig[i]='Z';
					break;
				}
		}
		return vig;
	}
	
	public String mod(int a, int b) {
		int x = a-(b*(a/b));
		return Integer.toString(x);
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
	
	public String xor(String i1, String i2) {
 		String output = "";
		for(int i = 0; i<i1.length();i++) {
 			if(i1.charAt(i) != i2.charAt(i)) {
 				output = output + "1";
 			} else {
 				output = output + "0";
 			}
 		}
 		return output;
	}
	
	public String pc1(String input) {
		String output = "";
		System.out.println(input);		
		for(int i=57;i>0;i=i-8) {
			output = output + input.charAt(i);
		}	
		for(int i=58;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=59;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=60;i>30;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=61;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=62;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=63;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=28;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		System.out.println(output);
		return output;
	}
	
	public boolean isPrime(int zahl)
	{
		if(zahl>=2) {
			if(zahl==2) {
				return true;
			} else {
				for(int i = 2; i<zahl;i++) {
					if(Integer.valueOf(this.mod(zahl, i)) == 0) {
						return false;
					} 
				}
				return true;
			} 
		}
		return false;
	}
}
