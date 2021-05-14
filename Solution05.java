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
		
		String output = "";
		String input = task.getStringArray(0);
		String key = task.getStringArray(1);
		
		for(int l=0;l<input.length();l++) {
			int h = 0;
			int v = 0;
			for(int i=0;i<vig.length();i++) {
				if(input.getCharAt(l)==vig.getCharAt(i)) {
					h=i;
				}
				if(key.getCharAt(l)==vig.getCharAt(i)) {
					v=i;
				}
			}
			output = output + vig[h][v];
		}
		
		return output;
	}

}
