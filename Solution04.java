package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution04 extends AbstractSolution {

	/** Aufgabe 4 - Faktorisierung
	 * Parameter: int[0] Zufallszahl (dezimal)
	 * L�sung: String Primfaktoren, aufsteigen, getrennt durch * (z.B. 2*2*5*7)
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution04(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String ausgabe = "";
		
		for(int i = 0;i<=(task.getIntArray(0)/2); i++) {
			
			
			ausgabe = ausgabe + "*" + i;
		}
		
		return ausgabe;
	}

}
