package de.nordakademie.blackjack;

public class Spielkarte {
	private final String farbe;
	private final String nummer;

	public Spielkarte(String farbe, String nummer) {
		this.farbe = farbe;
		this.nummer = nummer;
	}
	public static final String KARO = "Karo";
	public static final String PIK = "Pik";
	public static final String KREUZ = "Kreuz";
	public static final String HERZ = "Herz";
	
	public static final String ZWEI = "2";
	public static final String DREI = "3";
	public static final String VIER = "4";
	public static final String FUENF = "5";
	public static final String SECHS = "6";
	public static final String SIEBEN = "7";
	public static final String ACHT = "8";
	public static final String NEUN = "9";
	public static final String ZEHN = "10";
	public static final String BUBE = "Bube";
	public static final String DAME = "Dame";
	public static final String KOENIG = "König";
	public static final String ASS = "Ass";
	
	public static final String[] FARBEN = {KARO, PIK, KREUZ, HERZ};
	public static final String[] NUMMERN = {ZWEI, DREI, VIER, FUENF, SECHS, SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS};	

	public int kartenWert(){
		switch(nummer) {
		case ZWEI : return 2;
		case DREI : return 3;
		case VIER : return 4;
		case FUENF : return 5;
		case SECHS : return 6;
		case SIEBEN : return 7;
		case ACHT : return 8;
		case NEUN : return 9;
		case ZEHN : return 10;
		case BUBE : return 10;
		case DAME : return 10;
		case KOENIG : return 10;
		case ASS : return 11;
		}
		return 0;
	}
	public String getNummer(){
		return nummer;
	}
}
