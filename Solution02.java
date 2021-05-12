package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution02 extends AbstractSolution {

	/** Aufgabe 2 - XOR
	 * Parameter: String[0] HEX String A, String[1] HEX String B
	 * Lösung: String A MOD B als Binärstring
	 */

	/* Konstruktor - NICHT verändern */
	public Solution02(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		
 		String ausgabe= "";
		
 		String a = task.getStringArray(0);
 		String b = task.getStringArray(1);
 		
 		a = this.hexToBin(a);
 		b = this.hexToBin(b);
 		
 		if(a.length()!=b.length()) {
 			if(a.length()<b.length()) {
 				while(a.length()!=b.length()) {
 					a = "0" + a;
 				}
 			} else {
 				while(a.length()!=b.length()) {
 					b = "0" + b;
 				}
 			}
 		}
 		
 		for(int i = 0; i<a.length();i++) {
 			if(a.charAt(i) != b.charAt(i)) {
 				ausgabe = ausgabe + "1";
 			} else {
 				ausgabe = ausgabe + "0";
 			}
 		}
 		
		return ausgabe;		
		
	}

}
