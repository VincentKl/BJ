package de.nordakademie.blackjack;

public class BJSpielen {
	public static void main(String[] args) {
		new BJSpielen().spielStarten();
	}

	Kartenstapel stapel1 = new Kartenstapel();
	Spieler spieler1 = new Spieler();
	Geber geber1 = new Geber();

	public void spielStarten() {

		spieler1.karteAufnehmen(stapel1.gibKarte());
		spieler1.karteAufnehmen(stapel1.gibKarte());
		geber1.karteAufnehmen(stapel1.gibKarte());
	
		spielStand();
	}
	
	private void spielStand() {
		System.out.println("Der Geber hat " + geber1.punktestand() + ".");
		System.out.println("Du hast " + spieler1.punktestand() + ".");
	}
}