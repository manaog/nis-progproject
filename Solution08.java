package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution08 extends AbstractSolution {

	/** Aufgabe 8 - DES Feistel
	 * Parameter: String[0] Binärstring (64 Bit), String[1] Rundenschlüssel (Binärstring 48 Bit)
	 * Lösung: String L-Block XOR R-Block (Binärstring)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution08(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String k=task.getStringArray(1);
		String input=task.getStringArray(0);
		
		String l="";
		String r="";
		
		for(int i = 0; i<32;i++) {
			l=l+input.charAt(i);
			r=r+input.charAt(i+32);
		}
		
		r=this.desExpansion(r);
		
		r=this.xor(k, r);
		
		r=this.desSBlock(r);
		
		r=this.desPermutationP(r);
		
		return this.xor(l, r);
	}

}
