public class Main {
	static int counter = 0;

	/**
	 * Main in der ein neues Objekt Ticket_Verwalten erstellt wird
	 * 
	 * @see Ticket_Verwalten
	 *      Ein neues Mitarbeiter Objekt wird erstellt
	 * @see Mitarbeiter
	 *      Ein neues Kunden Objekt wird erstellt
	 * @see Kunde
	 *      Ticket_System_User methode wird in Ticket_Verwalten aufgerufen
	 *      Schleife f�r die Methode Ticket_System_Start in Ticket_Verwalten
	 * 
	 */
	public static void main(String[] args) {

		Ticket_Verwalten t = new Ticket_Verwalten();
		Mitarbeiter m = new Mitarbeiter("Mitarbeiter1", "123");
		Kunde k = new Kunde("Kunde1", "111");
		t.Ticket_System_User();
		while (counter != 1) {

			t.Ticket_System_Start(k);
		}
	}

}
