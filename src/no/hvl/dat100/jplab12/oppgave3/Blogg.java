package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] innleggtabell;
	private int nesteledig = 0;

	public Blogg() {

		innleggtabell = new Innlegg[20];

		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];

		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {

		return nesteledig;

		// throw new UnsupportedOperationException(TODO.method());
	}

	public Innlegg[] getSamling() {

		return innleggtabell;

		// throw new UnsupportedOperationException(TODO.method());

	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;

		while (pos < nesteledig && !funnet) {

			if (innleggtabell[pos].erLik(innlegg)) {

				funnet = true;
			}
			pos++;
		}

		if (funnet) {

			return pos;

		} else {

			return -1;
		}

		// throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;

		while (pos < nesteledig && !funnet) {

			if (innleggtabell[pos].erLik(innlegg)) {

				funnet = true;
			}
			
			pos++;
		}

		return funnet;

		// throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {

		if (nesteledig < innleggtabell.length) {

			return true;

		} else {

			return false;
		}

		// throw new UnsupportedOperationException(TODO.method());

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean finnes = finnes(innlegg);

		if (!finnes && nesteledig < innleggtabell.length) {

			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;

		} else {

			return false;
		}

		// throw new UnsupportedOperationException(TODO.method());
	}

	public String toString() {

		String output = Integer.toString(nesteledig) + "\n";

		for (int i = 0; i < nesteledig; i++) {

			output += innleggtabell[i].toString();

		}
		return output;

	}

	// throw new UnsupportedOperationException(TODO.method());
}
