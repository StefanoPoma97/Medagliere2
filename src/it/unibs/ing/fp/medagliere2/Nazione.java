package it.unibs.ing.fp.medagliere2;

public class Nazione implements Comparable<Nazione> {
	private String nome;
	private int nTotOri = 0;
	private int nTotArgenti = 0;
	private int nTotBronzi = 0;

	// costruttore vuoto
	public Nazione() {
	}

	public Nazione(String _nome) {
		nome = _nome;
	}

	public void addOro() {
		nTotOri++;
	}

	public void addArgento() {
		nTotArgenti++;
	}

	public void addBronzo() {
		nTotBronzi++;
	}

	public String toString() {
		return String.format("%s\t  %d  %d  %d", nome, nTotOri, nTotArgenti, nTotBronzi);

	}

	public int getnTotOri() {
		return nTotOri;
	}

	public int getnTotArgenti() {
		return nTotArgenti;
	}

	public int getnTotBronzi() {
		return nTotBronzi;
	}

	public String getNome() {
		return nome;
	}

	// override del metodo equals
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Nazione)) {
			Nazione n = (Nazione) obj;
			if (nome.equalsIgnoreCase(n.getNome()))
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public int compareTo(Nazione n) {
		int c;
		c = -Integer.compare(this.getnTotOri(), n.getnTotOri());
		if (c == 0)
			c = -Integer.compare(this.getnTotArgenti(), n.getnTotArgenti());
		if (c == 0)
			c = -Integer.compare(this.getnTotBronzi(), n.getnTotBronzi());
		return c;
	}

	public void aggiungiMedaglia(int pos) {
		switch (pos) {
		case 0:
			nTotOri++;
			break;
		case 1:
			nTotArgenti++;
			break;
		case 2:
			nTotBronzi++;
			break;

		}
	}

	public boolean meglioDi(Nazione n) {
		int c = this.compareTo(n);
		if (c < 0) {
			return true;
		} else
			return false;
	}

}
