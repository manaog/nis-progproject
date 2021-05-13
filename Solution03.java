package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution03 extends AbstractSolution {

	/** Aufgabe 3 - Modulo
	 * Parameter: int[0] Dezimalzahl 1, int[1] Dezimalzahl 2
	 * L�sung: Zahl 1 MOD Zahl 2
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution03(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String ausgabe;
		System.out.println(task.getIntArray(0)+ ", " + task.getIntArray(1));
		ausgabe = this.mod(task.getIntArray(0), task.getIntArray(1));
		System.out.println(ausgabe);
		return ausgabe;
	}

}
