package de.tum.jk.findbugs;

import java.util.LinkedList;

public class FindBugsMain {

	public static void main(String[] args) {

		LinkedList<String> thisisnull = null;

		thisisnull.add("this leads to an error");
	}
}
