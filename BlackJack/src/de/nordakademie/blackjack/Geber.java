package de.nordakademie.blackjack;

public class Geber {

	private Kartenhand geber = new Kartenhand();

	public boolean karteAufnehmen() {
		if (geber.punkteZaehlen() < 17) {
			return true;
		} else {
			return false;
		}

	}

	public void karteAufnehmen(Spielkarte karte) {

		geber.karteZiehen(karte);
	}
	public int punktestand() {
		return geber.punkteZaehlen();
	}
}
