package de.nordakademie.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spieler {
	private Kartenhand spieler = new Kartenhand();

	public boolean KarteAufnehmen() {

		System.out.println("Sie haben derzeit " + spieler.punkteZaehlen() + "Punkte. Darf's noch etwas mehr sein?");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String eingabe = reader.readLine();

			if (eingabe.equalsIgnoreCase("ja")) {
				return true;
			}
			if (eingabe.equalsIgnoreCase("nein")) {
				return false;
			} else {
				return Math.random() < 0.5;
			}
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
	}

	public void karteAufnehmen(Spielkarte karte) {

		spieler.karteZiehen(karte);
	}

	public int punktestand() {
		return spieler.punkteZaehlen();
	}
}	
