package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.jplab12.oppgave3.*;

public class SkrivBlogg {

	private static String FILEPATH = "/Users/iselinnilsen/OneDrive/HVL/DAT100/DAT100 Oblig 12/dat100-jplab12-testing/src/no/hvl/dat100/jplab12/tests/blogg.dat";

	public static boolean skriv(Blogg samling, String filepath) {
		
		try {
			
			File file = new File(filepath);
			PrintWriter skriver = new PrintWriter(file);
			
			String outputString = samling.toString();
			
			
			skriver.println(outputString);
			skriver.close();
			
			return true;
			
		} catch (FileNotFoundException e) {
			System.out.print(e.toString());
			return false;
		}

		//throw new UnsupportedOperationException(TODO.method());
	}
}
