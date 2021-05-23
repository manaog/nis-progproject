package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution04 extends AbstractSolution {

	/** Aufgabe 4 - Faktorisierung
	 * Parameter: int[0] Zufallszahl (dezimal)
	 * Lösung: String Primfaktoren, aufsteigen, getrennt durch * (z.B. 2*2*5*7)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution04(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String ausgabe = "";
		int tmp = task.getIntArray(0);
		for(int i = 0;i<=(task.getIntArray(0)/2); i++) {
			if(this.isPrime(i)) {
				if(Integer.parseInt(this.mod(tmp, i))==0) {
					if(ausgabe.length()==0) {
						ausgabe = ausgabe + i;
					} else {
						ausgabe = ausgabe + "*" + i;
					}
					tmp = tmp/i;
					i=0;
				}
			}
			
			
		}
		if(ausgabe.length()==0) {
			return Integer.toString(task.getIntArray(0));
		}
		return ausgabe;
	}

}
