package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution05 extends AbstractSolution {

	/** Aufgabe 5 - Vigen�re
	 * Parameter: String[0] Chiffretext, String[1] Key
	 * L�sung: String Klartext
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution05(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		char[] vig = this.fillVig();
		String output = "";
		String input = task.getStringArray(0);
		String key = task.getStringArray(1);
		for(int i=0;i<input.length();i++) {
			char ktmp = key.toUpperCase().charAt(i%key.length());
			int kint= this.vigAt(ktmp);
			int iint= this.vigAt(input.toUpperCase().charAt(i));
			int oint= iint-kint;
			if(oint<0) {
				oint += 26;
			}
			output = output + vig[oint];
		}
		return output;
	}
	
}
