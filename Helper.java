package de.unidue.iem.tdr.nis.client.solutions;

public class Helper {
	/** Hier können Sie ihre allgemeinen Funktionen erstellen,
	 * welche in allen Lösungen verfügbar sind.
	 * Sie können auch statische Methoden oder Subklassen benutzen.
	 * Sie können jedoch NICHT die Signatur des Konstruktors verändern.
	 */
	
	
	public Helper() {
		
	}
	
	public char[][] fillVig() {
		char[][] vig= new char[26][26];
		for(int i=0;i<26;i++) {
			for(int j=0;j<26;j++) {
				int tmp = i-j;
				if(tmp<0) {
					tmp = 25+tmp;
				}
				switch(tmp) {
				case 0:
					vig[i][j]='A';
					break;
				case 1:
					vig[i][j]='B';
					break;
				case 2:
					vig[i][j]='C';
					break;
				case 3:
					vig[i][j]='D';
					break;
				case 4:
					vig[i][j]='E';
					break;
				case 5:
					vig[i][j]='F';
					break;
				case 6:
					vig[i][j]='G';
					break;
				case 7:
					vig[i][j]='H';
					break;
				case 8:
					vig[i][j]='I';
					break;
				case 9:
					vig[i][j]='J';
					break;
				case 10:
					vig[i][j]='K';
					break;
				case 11:
					vig[i][j]='L';
					break;
				case 12:
					vig[i][j]='M';
					break;
				case 13:
					vig[i][j]='N';
					break;
				case 14:
					vig[i][j]='O';
					break;
				case 15:
					vig[i][j]='P';
					break;
				case 16:
					vig[i][j]='Q';
					break;
				case 17:
					vig[i][j]='R';
					break;
				case 18:
					vig[i][j]='S';
					break;
				case 19:
					vig[i][j]='T';
					break;
				case 20:
					vig[i][j]='U';
					break;
				case 21:
					vig[i][j]='V';
					break;
				case 22:
					vig[i][j]='W';
					break;
				case 23:
					vig[i][j]='X';
					break;
				case 24:
					vig[i][j]='Y';
					break;
				case 25:
					vig[i][j]='Z';
					break;
				}
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
	
	public boolean isPrime(int zahl)
	{
		if(zahl>=2) {
			if(zahl==2) {
				return true;
			} else {
				for(int i = 2; i<zahl;i++) {
					if(zahl%i == 0) {
						return false;
					} 
				}
				return true;
			} 
		}
		return false;
	}
}
