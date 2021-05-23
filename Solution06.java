package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution06 extends AbstractSolution {

	/** Aufgabe 6 - DES Rundenschl�ssel
	 * Parameter: String[0] Key (Bin�rstring), int[0] Runde (1-16)
	 * L�sung: String Rundenschl�ssel (Bin�rstring 48 Bit)
	 */

	/* Konstruktor - NICHT ver�ndern */
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
