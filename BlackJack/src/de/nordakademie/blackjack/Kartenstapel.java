package de.nordakademie.blackjack;

import java.util.Random;

public class Kartenstapel {
	private final Spielkarte[] kartenstapel = new Spielkarte[52];

	private int zeiger = 0;

	public Kartenstapel() {
		int i = 0;
		for (String farbe : Spielkarte.FARBEN) {
			for (String nummer : Spielkarte.NUMMERN) {
				kartenstapel[i++] = new Spielkarte(farbe, nummer);
			}
		}
		shuffle();
	}

	public void shuffle() {
		for (int i = kartenstapel.length; i > 1; i--)
			swap(kartenstapel, i - 1, new Random().nextInt(i));
	}

	private void swap(Object[] arr, int i, int j) {
		Object tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public Spielkarte gibKarte() {
		return kartenstapel[zeiger++];
	}
}