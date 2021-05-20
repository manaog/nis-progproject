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
		String output = "";
		String k = task.getStringArray(0);
		int r =task.getIntArray(0);
		
		if(k.length()==64) {
			k=this.pc1(k);
		}
		
		String c = "";
		String d = "";
		for(int i=1;i<k.length();i++) {
			if(i<28) {
				c = c + k.charAt(i);
			} else {
				d = d + k.charAt(i);
			}
		}
		String tmpC, tmpD;
		for(int i=1;i<=r;i++) {
			switch(i) {
			case 1:
				tmpC = c;
				tmpD = d;
				c = "";
				d = "";
				for(int j=2;j<c.length();j++) {
					c = c+tmpC.charAt(i);
				}
				for(int j=2;j<c.length();j++) {
					d = d+tmpD.charAt(i);
				}
				c = c+tmpC.charAt(1);
				d = d+tmpD.charAt(1);
				break;
			case 2:
				tmpC = c;
				tmpD = d;
				c = "";
				d = "";
				for(int j=2;j<c.length();j++) {
					c = c+tmpC.charAt(i);
				}
				for(int j=2;j<c.length();j++) {
					d = d+tmpD.charAt(i);
				}
				c = c+tmpC.charAt(1);
				d = d+tmpD.charAt(1);
				break;
			case 9:
				tmpC = c;
				tmpD = d;
				c = "";
				d = "";
				for(int j=2;j<c.length();j++) {
					c = c+tmpC.charAt(i);
				}
				for(int j=2;j<c.length();j++) {
					d = d+tmpD.charAt(i);
				}
				c = c+tmpC.charAt(1);
				d = d+tmpD.charAt(1);
				break;
			case 16:
				tmpC = c;
				tmpD = d;
				c = "";
				d = "";
				for(int j=2;j<c.length();j++) {
					c = c+tmpC.charAt(i);
				}
				for(int j=2;j<c.length();j++) {
					d = d+tmpD.charAt(i);
				}
				c = c+tmpC.charAt(1);
				d = d+tmpD.charAt(1);
				break;
			default:
				tmpC = c;
				tmpD = d;
				c = "";
				d = "";
				for(int j=3;j<c.length();j++) {
					c = c+tmpC.charAt(i);
				}
				for(int j=3;j<c.length();j++) {
					d = d+tmpD.charAt(i);
				}
				c = c+tmpC.charAt(1)+tmpC.charAt(2);
				d = d+tmpD.charAt(1)+tmpD.charAt(2);
				break;
			}
		}
		output = c+d;
		return output;
	}
}
