package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution09 extends AbstractSolution {

	/** Aufgabe 9 - DES komplette Runde
	 * Parameter: String[0] L-Block vorheriger Runde (Binärstring 32 Bit)
	 * 			  String[1] R-Block vorheriger Runde (Binärstring 32 Bit)
	 * 			  String[2] Key (Binärstring 64 Bit)
	 * 			  int[0] Runde (1-16)
	 * Lösung: String Binärstring (64 Bit, L-Block + R-Block)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution09(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String l=task.getStringArray(0);
		String r=task.getStringArray(1);
		String k=task.getStringArray(2);
		int round=task.getIntArray(0);
		
		
		k=this.desPC1(k);
		for(int i = 1;i<=round;i++) {
			k=this.desKeySchedule(k, i);
		}
		k=this.desPC2(k);
		
		return this.desFeistel(l,r,k);
	}

}
