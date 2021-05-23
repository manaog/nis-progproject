package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution06 extends AbstractSolution {

	/** Aufgabe 6 - DES Rundenschlüssel
	 * Parameter: String[0] Key (Binärstring), int[0] Runde (1-16)
	 * Lösung: String Rundenschlüssel (Binärstring 48 Bit)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution06(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String k = task.getStringArray(0);
		int round= task.getIntArray(0);
		
		k=this.desPC1(k);
		for(int i = 1;i<=round;i++) {
			k=this.desKeySchedule(k, i);
		}
		k=this.desPC2(k);
		return k;
		
	}
}
