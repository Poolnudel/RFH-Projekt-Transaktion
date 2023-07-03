/**
 * Dies ist die Dokumentation der Klasse Kunde.
 * Diese dient dem erstellen von Kunden Objekten.
 */
public class Kunde {
	protected String Kunde_Name;
	protected String Kunde_ID;

	/**
	 * Konstruktor fuer die Klasse Kunde
	 * Erstellt ein neues Objekt vom Typ Kunde
	 * 
	 * @param kunde_Name Kunden Name
	 * @param kunde_ID   Kunden ID
	 */
	public Kunde(String kunde_Name, String kunde_ID) {

		Kunde_Name = kunde_Name;
		Kunde_ID = kunde_ID;
	}

	public String getKunde_Name() {
		return Kunde_Name;
	}

	public void setKunde_Name(String kunde_Name) {
		Kunde_Name = kunde_Name;
	}
}
