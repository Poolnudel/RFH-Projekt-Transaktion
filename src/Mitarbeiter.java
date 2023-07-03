/**
 * Dies ist die Dokumentation der Klasse Mitarbeiter.
 * Diese dient dem erstellen von Mitarbeiter Objekten.
 */
public class Mitarbeiter {
	protected String Mitarbeiter_Name;
	protected String Mitarbeiter_ID;

	/**
	 * Konstruktor fuer die Klasse Kunde
	 * Erstellt ein neues Objekt vom Typ Kunde
	 * 
	 * @param mitarbeiter_Name Mitarbeiter Name
	 * @param mitarbeiter_ID   Mitarbeiter ID
	 */
	public Mitarbeiter(String mitarbeiter_Name, String mitarbeiter_ID) {

		Mitarbeiter_Name = mitarbeiter_Name;
		Mitarbeiter_ID = mitarbeiter_ID;
	}

	public String getMitarbeiter_Name() {
		return Mitarbeiter_Name;
	}

	public void setMitarbeiter_Name(String mitarbeiter_Name) {
		Mitarbeiter_Name = mitarbeiter_Name;
	}

	public String getMitarbeiter_ID() {
		return Mitarbeiter_ID;
	}

	public void setMitarbeiter_ID(String mitarbeiter_ID) {
		Mitarbeiter_ID = mitarbeiter_ID;
	}

}
