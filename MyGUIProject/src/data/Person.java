package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> Liste = new ArrayList<Person>();
	//
	public static ArrayList<Person> getListe() {
		return Liste;
	}
	public static void setListe(ArrayList<Person> liste) {
		Liste = liste;
	}
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getWohnort() {
		return wohnort;
	}
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	private String vorname;
	private String nachname;
	private String strasse;
	private String hausnummer;
	private String wohnort;
	private String plz;
	
	public String toString() {
	return getNachname() + ", " + getVorname();
	}
}
