package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution01 extends AbstractSolution {
	
	/** Aufgabe 1 - Klartext
	 * Parameter: String[0] Klartext
	 * L�sung: String Klartext
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution01(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		//Klartextparameter per task.getStringArray() auf index 0 holen
		//Das ganze als L�sung zur�ckgeben.
		String ausgabe = task.getStringArray(0);
		
		return ausgabe;
	}

}
