package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution07 extends AbstractSolution {

	/** Aufgabe 7 - DES R-Block
	 * Parameter: String[0] Binärstring (64 Bit), int[0] Runde
	 * Lösung: String R-Block (Binärstring 48 Bit)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution07(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
//		String input=this.desInitialPermutation(task.getStringArray(0));
		String input=task.getStringArray(0);
		int round=task.getIntArray(0);
		String k="000000000000000000000000000000000000000000000000";
		
		String r="";
		String l="";
		for(int i=0;i<32;i++) {
			l=l+input.charAt(i);
			r=r+input.charAt(i+32);
		}
		
		for(int i=1;i<=round;i++) {
			input=this.desFeistel(l, r, k);
			
			r="";
			l="";
			for(int j=0;j<32;j++) {
				l=l+input.charAt(j);
				r=r+input.charAt(j+32);
			}
		}
		
		return this.desExpansion(r);
	}
}
