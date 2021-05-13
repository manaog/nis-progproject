package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution05 extends AbstractSolution {

	/** Aufgabe 5 - Vigenère
	 * Parameter: String[0] Chiffretext, String[1] Key
	 * Lösung: String Klartext
	 */

	/* Konstruktor - NICHT verändern */
	public Solution05(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		char[][] vig = this.fillVig();
		for(int i=0;i<26;i++) {
			for(int j=0;j<26;j++) {
				if(j==0) {
					System.out.print(vig[i][j]);
				} else {
					System.out.print(", " + vig[i][j]);
				}
			}
			System.out.print("\n");
		}
		return "false";
	}

}
