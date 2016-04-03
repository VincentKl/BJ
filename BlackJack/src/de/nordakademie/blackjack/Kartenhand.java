package de.nordakademie.blackjack;

public class Kartenhand {
	private Spielkarte[] kartenhand = new Spielkarte[21];

	public void karteZiehen(Spielkarte handkarte) {
		int zeiger = 0;
		kartenhand[zeiger] = handkarte;
		zeiger++;
	}

	public int punkteZaehlen() {
		int punkteStand = 0;
		int zaehlerAss = 0;
		for (Spielkarte spielkarte : kartenhand) {
			
			if (spielkarte != null)
			{
			
			punkteStand = punkteStand + spielkarte.kartenWert();
			if (spielkarte.getNummer().equals(Spielkarte.ASS)) {
				zaehlerAss++;
			}
		}
			}
		if (zaehlerAss > 0 && punkteStand > 21) {
			punkteStand = punkteStand - 10;
		}
		if (zaehlerAss > 1 && punkteStand > 21) {
			punkteStand = punkteStand - 10;
		}
		if (zaehlerAss > 2 && punkteStand > 21) {
			punkteStand = punkteStand - 10;
		}
		if (zaehlerAss > 3 && punkteStand > 21) {
			punkteStand = punkteStand - 10;
		}
		return punkteStand;
		
	}
}
