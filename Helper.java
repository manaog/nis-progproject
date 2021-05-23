package de.unidue.iem.tdr.nis.client.solutions;

public class Helper {
	/** Hier können Sie ihre allgemeinen Funktionen erstellen,
	 * welche in allen Lösungen verfügbar sind.
	 * Sie können auch statische Methoden oder Subklassen benutzen.
	 * Sie können jedoch NICHT die Signatur des Konstruktors verändern.
	 */
	
	
	public Helper() {
		
	}	

//	allgemeine Helper-Methoden:
	
	public String mod(int a, int b) {
		int x = a-(b*(a/b));
		return Integer.toString(x);
	}
	
	public String binToFour(String input) {
		while(input.length()<4) {
			input = "0" + input;
		}
		return input;
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
		if(dec==0) {
			return "0";
		}
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
	
	public String binToDec(String bin) {
		String output= "";
		
		int a=0;
		int b=1;
		for(int i=bin.length()-1;i>=0;i--) {
			int dec =Integer.parseInt(bin.charAt(i)+"");
			a = a + (dec * b);
			b= b*2;
		}
		output = Integer.toString(a);
		return output;
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
//-------------------------------------------------------------------------------------------	
//	Helper-Methoden für den DES:
	
	public String desPC1(String input) {
		String output = "";	
		for(int i=56;i>=0;i=i-8) {
			output = output + input.charAt(i);
		}	
		for(int i=57;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=58;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=59;i>30;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=62;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=61;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=60;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=27;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		return output;
	}
	
	public String desPC2(String input) {
		String output;
		
		output=input.charAt(13)+ "" + input.charAt(16)+ "" + input.charAt(10)+ "" + input.charAt(23)+ "" + input.charAt(0)+ "" + input.charAt(4)+ "" + input.charAt(2)+ "" + input.charAt(27)+ "" + input.charAt(14)+ "" + input.charAt(5)+ "" + input.charAt(20)+ "" + input.charAt(9)+ "" + input.charAt(22)+ "" + input.charAt(18)+ "" + input.charAt(11)+ "" + input.charAt(3)+ "" + input.charAt(25)+ "" + input.charAt(7)+ "" + input.charAt(15)+ "" + input.charAt(6)+ "" + input.charAt(26)+ "" + input.charAt(19)+ "" + input.charAt(12)+ "" + input.charAt(1)+ "" + input.charAt(40)+ "" + input.charAt(51)+ "" + input.charAt(30)+ "" + input.charAt(36)+ "" + input.charAt(46)+ "" + input.charAt(54)+ "" + input.charAt(29)+ "" + input.charAt(39)+ "" + input.charAt(50)+ "" + input.charAt(44)+ "" + input.charAt(32)+ "" + input.charAt(47)+ "" + input.charAt(43)+ "" + input.charAt(48)+ "" + input.charAt(38)+ "" + input.charAt(55)+ "" + input.charAt(33)+ "" + input.charAt(52)+ "" + input.charAt(45)+ "" + input.charAt(41)+ "" + input.charAt(49)+ "" + input.charAt(35)+ "" + input.charAt(28)+ "" + input.charAt(31);
		
		return output;
	}
	
	public String desIP1(String input) {
		String output="";
		
		for(int i = 39;i>=32;i--) {
			
			output=output+input.charAt(i)+ input.charAt(i-32)+ input.charAt(i-32+40)+ input.charAt(i-32+40-32)+ input.charAt(i-32+40-32+40)+ input.charAt(i-32+40-32+40-32)+ input.charAt(i-32+40-32+40-32+40)+ input.charAt(i-32+40-32+40-32+40-32);
		}
		
		return output;
	}
	
	public String desKeySchedule(String input, int r) {
		String output="";
		String c = "";
		String d = "";
		for(int i=0;i<input.length();i++) {
			if(i<28) {
				c = c + input.charAt(i);
			} else {
				d = d + input.charAt(i);
			}
		}
		
		String tmpC, tmpD;
		tmpC = "";
		tmpD = "";
		switch(r) {
		case 1:
			for(int j=1;j<c.length();j++) {
				tmpC = tmpC+c.charAt(j);
				tmpD = tmpD+d.charAt(j);
			}
			tmpC = tmpC+c.charAt(0);
			tmpD = tmpD+d.charAt(0);
			break;
		case 2:
			for(int j=1;j<c.length();j++) {
				tmpC = tmpC+c.charAt(j);
				tmpD = tmpD+d.charAt(j);
			}
			tmpC = tmpC+c.charAt(0);
			tmpD = tmpD+d.charAt(0);
			break;
		case 9:
			for(int j=1;j<c.length();j++) {
				tmpC = tmpC+c.charAt(j);
				tmpD = tmpD+d.charAt(j);
			}
			tmpC = tmpC+c.charAt(0);
			tmpD = tmpD+d.charAt(0);
			break;
		case 16:
			for(int j=1;j<c.length();j++) {
				tmpC = tmpC+c.charAt(j);
				tmpD = tmpD+d.charAt(j);
			}
			tmpC = tmpC+c.charAt(0);
			tmpD = tmpD+d.charAt(0);
			break;
		default:
			for(int j=2;j<c.length();j++) {
				tmpC = tmpC+c.charAt(j);
				tmpD = tmpD+d.charAt(j);
			}
			tmpC = tmpC+c.charAt(0)+c.charAt(1);
			tmpD = tmpD+d.charAt(0)+d.charAt(1);
			break;
		}
		c=tmpC;
		d=tmpD;
		
		output = c+""+d;
		return output;
	}
	
	public String desInitialPermutation(String input) {
		String output="";
		
		for(int i=57;i>0;i=i-8) {
			output = output + input.charAt(i);
		}	
		for(int i=59;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=61;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=63;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=56;i>=0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=58;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=60;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		for(int i=62;i>0;i=i-8) {
			output = output + input.charAt(i);
		}
		
		return output;
	}
	
	public String desExpansion(String input) {
		String output="";
		
		output=""+input.charAt(31) + input.charAt(0) + input.charAt(1) + input.charAt(2) + input.charAt(3) + input.charAt(4) + input.charAt(3) + input.charAt(4) + input.charAt(5) + input.charAt(6) + input.charAt(7) + input.charAt(8) + input.charAt(7) + input.charAt(8) + input.charAt(9) + input.charAt(10) + input.charAt(11) + input.charAt(12) + input.charAt(11) + input.charAt(12) + input.charAt(13) + input.charAt(14) + input.charAt(15) + input.charAt(16) + input.charAt(15) + input.charAt(16) + input.charAt(17) + input.charAt(18) + input.charAt(19) + input.charAt(20) + input.charAt(19) + input.charAt(20) + input.charAt(21) + input.charAt(22) + input.charAt(23) + input.charAt(24) + input.charAt(23) + input.charAt(24) + input.charAt(25) + input.charAt(26) + input.charAt(27) + input.charAt(28) + input.charAt(27) + input.charAt(28) + input.charAt(29) + input.charAt(30) + input.charAt(31) + input.charAt(0);
		
		return output;
	}
	
	public String desSBlock(String input) {
		String output="";
		String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="";
		for(int j=0;j<6;j++) {
			s1=s1+input.charAt(j);
			s2=s2+input.charAt(j+6);
			s3=s3+input.charAt(j+12);
			s4=s4+input.charAt(j+18);
			s5=s5+input.charAt(j+24);
			s6=s6+input.charAt(j+30);
			s7=s7+input.charAt(j+36);
			s8=s8+input.charAt(j+42);
		}
		
		output=this.desSBlock(s1, 0)+this.desSBlock(s2, 1)+this.desSBlock(s3, 2)+this.desSBlock(s4, 3)+this.desSBlock(s5, 4)+this.desSBlock(s6, 5)+this.desSBlock(s7, 6)+this.desSBlock(s8, 7);
		
		 return output;
	}
	
	public String desSBlock(String input, int s) {
		int[][][] sboxes={	{{14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7},{0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8},{4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0},{15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}},
							{{15,1,8,15,6,11,3,4,9,7,2,13,12,0,5,10},{3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},{0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},{13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}},
							{{10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},{13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},{13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},{1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}},
							{{7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},{13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},{10,6,9,0,12,11,7,13,15,1,3,14,5,2,8,4},{3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}},
							{{2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},{14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},{4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},{11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}},
							{{12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},{10,15,4,2,7,12,9,5,6,1,13,14,0,11,3,8},{9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},{4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}},
							{{4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},{13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},{1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},{6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}},
							{{13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},{1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},{7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},{2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}},
						 };
		String output="";
		String outer= ""+input.charAt(0)+input.charAt(5);
		String inner= ""+input.charAt(1)+input.charAt(2)+input.charAt(3)+input.charAt(4);
		int a = Integer.parseInt(this.binToDec(outer));
		int b = Integer.parseInt(this.binToDec(inner));
		
		output=this.decToBin(Integer.toString(sboxes[s][a][b]));
		if(output.length()<4) {
			output=this.binToFour(output);
		}
		return output;
	}
	
	
	public String desFeistel(String l, String r, String k) {
		String output="";
		String tmpR="";
		for(int i=0;i<32;i++) {
			tmpR=tmpR+r.charAt(i);
		}
		
		tmpR=this.desExpansion(r);
		tmpR=this.xor(k, tmpR);
		tmpR=this.desSBlock(tmpR);
		tmpR=this.desPermutationP(tmpR);
		tmpR=this.xor(l, tmpR);
		
		output= r+tmpR;
		return output;
	}
	
	public String desPermutationP(String input) {
		String output="";
		
		output = output + input.charAt(15) + input.charAt(6) + input.charAt(19) + input.charAt(20) + input.charAt(28) + input.charAt(11) + input.charAt(27) + input.charAt(16) + input.charAt(0) + input.charAt(14) + input.charAt(22) + input.charAt(25) + input.charAt(4) + input.charAt(17) + input.charAt(30) + input.charAt(9) + input.charAt(1) + input.charAt(7) + input.charAt(23) + input.charAt(13) + input.charAt(31) + input.charAt(26) + input.charAt(2) + input.charAt(8) + input.charAt(18) + input.charAt(12) + input.charAt(29) + input.charAt(5) + input.charAt(21) + input.charAt(10) + input.charAt(3) + input.charAt(24);
		
		return output;
	}
	
	
//-----------------------------------------------------------------------------------
//	Helper-Methode für Aufgabe 4:
	
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
//-----------------------------------------------------------------------------------------	
//	Helper-Methoden für Aufgabe 5:
	
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
//---------------------------------------------------------
}
